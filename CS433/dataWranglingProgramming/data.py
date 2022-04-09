#cs433
#group2

import requests
from datetime import datetime, timedelta
import pandas as pd
import os

#send a GET request to the API, and store the JSON response in a variable data
data = requests.get("https://api.covid19api.com/summary").json()

#get the date on which the data was updated, and save it to a variable today
today = str(datetime.strptime(
 data['Countries'][0]['Date'][:10], "%Y-%m-%d").strftime("%d-%m-%y"))
global_data = data["Global"]

#look at the number of confirmed cases, deaths and recovered patients worldwide and print them to the console using f-string literals
print(f"\nGlobal status as of {today}")
print(f"Total cases: {global_data['TotalConfirmed']}")
print(f"New cases since yesterday: {global_data['NewConfirmed']}")
print(f"Total Deaths: {global_data['TotalDeaths']}")
print(f"New Deaths since yesterday: {global_data['NewDeaths']}")
print(f"Total Recovered: {global_data['TotalRecovered']}")
print(f"New Recovered since yesterday: {global_data['NewRecovered']}")

# create three separate DataFrames for confirmed cases, deaths and recovered patients
country_df_confirmed = pd.DataFrame(columns=['Country', today])
country_df_deaths = pd.DataFrame(columns=['Country', today])
country_df_recovered = pd.DataFrame(columns=['Country', today])

#fill dataframe up with the data
for country in data["Countries"]:
    country_df_confirmed = country_df_confirmed.append(
        {'Country': country['Country'], today: country['TotalConfirmed']}, ignore_index=True)

    country_df_deaths = country_df_deaths.append(
        {'Country': country['Country'], today: country['TotalDeaths']}, ignore_index=True)

    country_df_recovered = country_df_recovered.append(
        {'Country': country['Country'], today: country['TotalRecovered']}, ignore_index=True)

#function to update/send to csv file
def update_csv(file, df):
    global today
  # case where the file already exists
    if(os.path.exists(file)):
        original_countries = pd.read_csv('confirmed.csv')
        current_df = pd.read_csv(file)
        current_df[today] = pd.DataFrame(columns=[today])
        today_data = []

  #Sometimes, the data for a particular country is missing in the API’s response. we just store the data received on the previous day, and assume that there was no change
        yesterday = str(
            (datetime.strptime(
                today,
                "%d-%m-%y") -
                timedelta(
                days=1)).strftime("%d-%m-%y"))

#get the list of original countries from the CSV to identify which countries are missing in the API’s response this time
        for country in original_countries.iloc[:, 0]:
            if (country in list(df.loc[:, 'Country'])):
                today_data.append(int(df[df['Country'] == country][today]))
            else:
                today_data.append(
                    current_df.loc[current_df['Country'] == country][yesterday].item())
        current_df[today] = pd.Series(today_data)
        current_df.to_csv(file, index=False)
    else:
        countries = requests.get("https://api.covid19api.com/countries").json()
        countries = sorted([i['Country'] for i in countries])
        country_df = pd.DataFrame(data=countries, columns=['Country'])
        country_df[today] = df[today]
        country_df.to_csv(file, index=False)

#confirm the updates to a csv file
update_csv('confirmed.csv', country_df_confirmed)
update_csv('deaths.csv', country_df_deaths)
update_csv('recovered.csv', country_df_recovered)

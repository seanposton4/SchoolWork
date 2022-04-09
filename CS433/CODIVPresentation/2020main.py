import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import datetime

covid_data = pd.read_csv('https://learn.sharpsightlabs.com/datasets/covid19/covid_data_2020-04-09.csv'
                         ,sep = ";"
                         )
covid_data = covid_data.assign(date = pd.to_datetime(covid_data.date, format='%Y-%m-%d'))
covid_data = covid_data.fillna(value = {'subregion':''})

#get US data
covid_data_US = (covid_data.query('country == "US"'))

print(covid_data_US)

sns.lineplot(data = covid_data_US
             ,x = 'date'
             ,y = 'new_cases'
             )
plt.xticks(rotation=45, horizontalalignment='right')
plt.title('Covid-19 daily new cases\nin the United States', fontsize = 18)
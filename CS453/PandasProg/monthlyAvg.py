import pandas as pd

def month(row):
  year = row["Date"].split("-")[0]
  month = row["Date"].split("-")[1]
  return year+"-"+month

# grouping function
def gfunc(x):
  d = {}
  d['Total_Volume'] = x['Volume'].sum()
  d['Average_Open_Price'] = x['Open'].mean()
  d['Average_Close_Price'] = x['Close'].mean()
  d['Gain/Loss'] = d['Average_Close_Price'] - d['Average_Open_Price']
  return pd.Series(d, index=['Average_Open_Price', 'Average_Close_Price', 'Total_Volume', 'Gain/Loss'])

df = pd.read_csv("SP500.csv")
# year and month parameters 
df['Year-Month'] = df.apply (lambda row: month(row), axis=1)

# Group based on new column created and the function
groups = df.groupby(['Year-Month']).apply(gfunc)

groups['Date'] = pd.to_datetime(df['Date'])

#query
min_limit = 2666
max_limit = 2800
groups = groups[(groups["Average_Open_Price"] > min_limit) & (groups["Average_Open_Price"] < max_limit)]
print(groups)
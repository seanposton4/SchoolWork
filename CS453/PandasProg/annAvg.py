import pandas as pd

def getYear(row):
  year = row["Date"].split("-")[0]
  return year

# grouping function
def gfunc(x):
  d = {}
  d['Total_Volume'] = x['Volume'].sum()
  d['Average_Open_Price'] = x['Open'].mean()
  d['Average_Close_Price'] = x['Close'].mean()
  d['Gain/Loss'] = d['Average_Close_Price'] - d['Average_Open_Price']
  return pd.Series(d, index=['Average_Open_Price', 'Average_Close_Price', 'Total_Volume', 'Gain/Loss'])

df = pd.read_csv("SP500.csv")
# year 
df["Year"] = df.apply (lambda row: getYear(row), axis=1)

# Group based on new column created and the function
groups = df.groupby(["Year"]).apply(gfunc)

print(groups)

print('Max Gain Year: ')
print(groups[groups['Gain/Loss'] == groups['Gain/Loss'].max()])
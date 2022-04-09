import pandas as pd

def percent(series):
    return (len([i for i in series if i >= 1]) / len(series)) * 100

df = pd.read_csv('creditdata.csv')

print(df.groupby(['age'])['serious_dlqin2yrs'].apply(percent).reset_index(name='percent_bad').reset_index().query('percent_bad > 0'))
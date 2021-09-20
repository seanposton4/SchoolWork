import pandas as pd

frame = pd.read_csv('SP500.csv')

#Mask for daily change over 20%
mask = ((frame['Close'] - frame['Open']) / frame['Open'] >= .2) 

twentygain = frame.loc[mask]

print(twentygain) 
#There are none that are over 20%
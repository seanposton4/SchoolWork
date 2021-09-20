#Print max volume
import pandas as pd
import numpy as np

df = pd.read_csv('SP500.csv')

mask = df['Volume'] == df['Volume'].max()

print(df[mask])
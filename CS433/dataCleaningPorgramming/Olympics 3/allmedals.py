import pandas as pd
import numpy as np

df = pd.read_csv('olympics.csv', header=1)

rename = {'Unnamed: 0': 'Country',
            '? Summer': 'Summer Olympics',
            '01 !': 'Gold',
            '02 !': 'Silver',
            '03 !': 'Bronze',
            '? Winter': 'Winter Olympics',
            '01 !.1': 'Gold.1',
            '02 !.1': 'Silver.1',
            '03 !.1': 'Bronze.1',
            '? Games': '# Games',
            '01 !.2': 'Gold.2',
            '02 !.2': 'Silver.2',
            '03 !.2': 'Bronze.2'}

df.rename(columns=rename, inplace=True)

mask = df[((df['Gold'] >= 1) & (df['Silver'] >= 1) & (df['Bronze'] >= 1)) 
        & (df['Gold.1'] >= 1) & (df['Silver.1'] >= 1) & (df['Bronze.1'] >= 1)]

print(mask)

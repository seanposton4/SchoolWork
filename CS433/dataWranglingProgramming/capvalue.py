import pandas as pd

def cap_value(x:float, cap:int):
    if x > cap:
        return cap
    else:
        return x

df = pd.read_csv('creditdata.csv')

capval5 = lambda x: cap_value(x, 5)
df['debt_ratio'] = df['debt_ratio'].apply(capval5)

print(df['debt_ratio'])
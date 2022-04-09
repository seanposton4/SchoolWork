import pandas as pd

summ = pd.read_csv(r'pandasProgramming\SP500.csv')

print('Summary:')
print(summ[['Open', 'High', 'Low', 'Close', 'Adj Close', 'Volume']].describe())


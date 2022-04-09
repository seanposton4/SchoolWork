import pandas as pd

frame = pd.read_csv(r'pandasProgramming\SP500.csv')
frame['Date'] = pd.to_datetime(frame['Date'])

mask = (frame['Date'] >= '2018-01-01') & (frame['Date'] <= '2018-01-31')

janframe = frame.loc[mask]

fileout = open('pandasProgramming/jangainlossout.csv', 'w')

janframe['Gain/Loss'] = janframe['Close'] - janframe['Open']

fileout.write(janframe.sort_values(['Gain/Loss']).to_csv(index=False))
#We could also remove the Gain/Loss column to keep the data the same with this line instead:
#fileout.write(janframe.sort_values(['Gain/Loss']).drop(['Gain/Loss'], axis=1).to_csv(index=False))
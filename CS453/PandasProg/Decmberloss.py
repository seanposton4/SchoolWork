import pandas as pd
#Switched to April of 2018 because the file stops at April of 2018
#which does not include December of 2018, which is the assignment.

frame = pd.read_csv(r'SP500.csv')
frame['Date'] = pd.to_datetime(frame['Date'])

mask = (frame['Date'] >= '2018-04-1') & (frame['Date'] <= '2018-04-27')

decframe = frame.loc[mask]

fileout = open('aprilgainlossout.csv', 'w')

decframe['Gain/Loss'] = decframe['Close'] - decframe['Open']

fileout.write(decframe.sort_values(['Gain/Loss']).to_csv(index=False))
#We could also remove the Gain/Loss column to keep the data the same with this line instead:
#fileout.write(decframe.sort_values(['Gain/Loss']).drop(['Gain/Loss'], axis=1).to_csv(index=False))
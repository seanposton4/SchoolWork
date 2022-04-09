import pandas as pd

frame = pd.read_csv('pandasProgramming/SP500.csv')

frame['Gain/Loss'] = frame['Close'] - frame['Open']

#Max Gain
print(frame[frame['Gain/Loss'] == frame['Gain/Loss'].max()])
#Max Loss
print(frame[frame['Gain/Loss'] == frame['Gain/Loss'].min()])
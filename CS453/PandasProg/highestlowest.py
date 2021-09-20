import pandas as pd

frame = pd.read_csv('SP500.csv')

frame['Gain/Loss'] = frame['Close'] - frame['Open']

#Max Gain
print('Max Gain: ')
print(frame[frame['Gain/Loss'] == frame['Gain/Loss'].max()])
#Max Loss
print('\nMax Loss: ')
print(frame[frame['Gain/Loss'] == frame['Gain/Loss'].min()])
import numpy as np

#Declare variables
openPrices    = np.array([2683.72998,2697.850098,2719.310059,2731.330078,2742.669922,2751.149902,2745.550049,2752.969971,2770.179932,2798.959961])
closePrices   = np.array([2695.810059,2713.060059,2723.98999,2743.149902,2747.709961,2751.290039,2748.22998,2767.560059,2786.23999,2776.419922])

dailyEarnings = [(closePrice - openPrice) for openPrice, closePrice in zip(openPrices, closePrices)]
mean          = round(np.mean(dailyEarnings), 6)
stddev        = round(np.std(dailyEarnings), 6)

#Sort data into one, two, and three deviations from the mean
deviations = {'OneDev': [], 'TwoDev': [], 'ThreeDev': []}
for earnings in dailyEarnings:
  if (mean - stddev) < earnings <= (mean + stddev):
    deviations['OneDev'].append(earnings)
  elif (mean - stddev*2) < earnings <= (mean + stddev*2):
    deviations['TwoDev'].append(earnings)
  elif (mean - stddev*3) < earnings <= (mean + stddev*3):
    deviations['ThreeDev'].append(earnings)

#Round deviation elements
deviations['OneDev'] = [round(elem, 6) for elem in deviations['OneDev']]
deviations['TwoDev'] = [round(elem, 6) for elem in deviations['TwoDev']]
deviations['ThreeDev'] = [round(elem, 6) for elem in deviations['ThreeDev']]

#Print data
print(f'Mean of Daily Earnings:    {mean}')
print(f'Std Dev of Daily Earnings: {stddev}')
print(f'One Std Dev from Mean:     {deviations["OneDev"]}')
print(f'Two Std Dev from Mean:     {deviations["TwoDev"]}')
print(f'Three Std Dev from Mean:   {deviations["ThreeDev"]}')
def dailyEarnings(open:list, close:list) -> list:
  earnings = [0] * min([len(open), len(close)])
  for i in range(min([len(open), len(close)])):
    earnings[i] = close[i] - open[i]
  return earnings

def meanEarnings(earnings:list) -> float:
  return sum(earnings) / len(earnings)

def stddevEarnings(earnings:list) -> float:
  mean = meanEarnings(earnings)
  variance = sum((i - mean) ** 2 for i in earnings) / len(earnings)
  #I wasn't sure if importing math was allowed.
  return variance ** (1/2)

openPrices    = [2683.72998,2697.850098,2719.310059,2731.330078,2742.669922,2751.149902,2745.550049,2752.969971,2770.179932,2798.959961]
closePrices   = [2695.810059,2713.060059,2723.98999,2743.149902,2747.709961,2751.290039,2748.22998,2767.560059,2786.23999,2776.419922]

dailyEarnings = dailyEarnings(openPrices, closePrices)
mean          = round(meanEarnings(dailyEarnings), 6)
stddev        = round(stddevEarnings(dailyEarnings), 6)

deviations = {'OneDev': [], 'TwoDev': [], 'ThreeDev': []}
for earnings in dailyEarnings:
  if (mean - stddev) < earnings <= (mean + stddev):
    deviations['OneDev'].append(earnings)
  elif (mean - stddev*2) < earnings <= (mean + stddev*2):
    deviations['TwoDev'].append(earnings)
  elif (mean - stddev*3) < earnings <= (mean + stddev*3):
    deviations['ThreeDev'].append(earnings)

print(f'Mean of Daily Earnings:    {mean}')
print(f'Std Dev of Daily Earnings: {stddev}')
print(f'One Std Dev from Mean:     {deviations["OneDev"]}')
print(f'Two Std Dev from Mean:     {deviations["TwoDev"]}')
print(f'Three Std Dev from Mean:   {deviations["ThreeDev"]}')
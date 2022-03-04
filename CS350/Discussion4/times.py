import math

#initialize times in seconds and convert to microseconds
runtime = [1, 60, 3600, 86400, 2.628 * 10**6, 3.154 * 10**7]
microruntime = [i * 10**6 for i in runtime]

lgn = lambda n: 2**n
nlgn = lambda n: 2**n / n
#log is base e, log10 is base 10.
twon = lambda n: math.log(n) / math.log(2)

funcs = [lgn, nlgn, twon]

#print times
for func in funcs:
  for time in microruntime:
    print(func(time))

#n!
n = 0
for time in microruntime:
  while math.factorial(n) <= time:
    n += 1
  print(f'Times: {n} in {time}')
  n = 0
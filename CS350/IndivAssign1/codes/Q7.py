import math
n = 1000
print(f'log(n): {math.log(n)}')
for i in range(1, 4):
  print(f'n^{i}: {n**i}')
print(f'2^n: {"{:.2e}".format(2**n)}')
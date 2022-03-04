"""
Factor n given the following information:
s = (p - q) / 2
t = (p + q) / 2
t > sqrt(n)
t^2 - n is a perfect square
Test successive integers to find t and s, hence p and q.
"""
import math
def isPerfectSquare(num) -> bool:
  if num <= 0:
    return False

  root = math.sqrt(num)

  if int(root + 0.5) ** 2 == num:
    return True
  else:
      return False


n = 310485170747

t = math.floor(math.sqrt(n))

while not isPerfectSquare((t ** 2) - n):
  t += 1

print(f'This is our t: {t}')
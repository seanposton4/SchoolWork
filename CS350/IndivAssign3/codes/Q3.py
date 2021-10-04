#PrefixAverages2
#Runtime: O(n)
import numpy as np

def PrefixAverages2(arr):
  n = len(arr)
  a, s = [0] * n, 0

  for i in range(n):
    s += arr[i]
    a[i] = round(s / (i + 1))
  return a

arr = np.random.randint(0, high=1000, size=100)
print(f'{PrefixAverages2(arr)}')
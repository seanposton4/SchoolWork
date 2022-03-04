#PrefixAverages1
#Runtime: O(n^2)

import numpy as np
def PrefixAverages1(arr):
  a = []
  for i in range(len(arr)):
    s = arr[0]
    for j in range(1, i):
      s = s + arr[j]
    a.append(round(s / (i + 1)))
  return a


arr = np.random.randint(0, high=1000, size=100)
print(f'{PrefixAverages1(arr)}')
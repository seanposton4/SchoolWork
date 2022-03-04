# ArrayMax
# RunTime: O(n)

import numpy as np
def ArrayMax(arr) -> int:
  curr_max = arr[0]

  for i in arr:
    if i > curr_max:
      curr_max = i

  return curr_max

arr = np.random.randint(0, high=1000, size=100)
print(f'Max in Arr: {ArrayMax(arr)}')
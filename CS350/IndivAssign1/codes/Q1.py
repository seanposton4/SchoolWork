numsToSort = [100, 1000, 10000, 100000, 1000000]
aSpeed, bSpeed = 20 * 10**9, 10 * 10**9
aTime, bTime = [], []

for num in numsToSort:
  aTime.append(num / aSpeed)
  bTime.append(num / bSpeed)

print('All Times are in Seconds: ')
print(aTime)
print(bTime)
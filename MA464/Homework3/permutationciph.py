import math
# In key, must put f(x) side first, then x.
key = {3:0, 0: 1, 5:2, 1:3, 6:4, 2:5, 7:6, 4:7}
ct = 'TGEEMNELNNTDROEOAAHDOETCSHAEIRLM'

#Divide ct into permutated parts
keyn = len(key)
dividedct = []
for i in range(len(ct)):
  if i % keyn == 0:
    dividedct.append([])
  dividedct[math.floor(i / keyn)].append(ct[i])

for i in range(len(dividedct)):
  for j in range(len(dividedct[i])):
    print(dividedct[i][key[j]], end='')
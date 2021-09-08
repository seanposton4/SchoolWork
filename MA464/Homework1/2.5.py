# Use exhaustive key search to decrypt the following ct.

ct = 'BEEAKFYDJXUQYHYJIQRYHTYJIQFBQDUYJIIKFUHCQD' #A = 65
alpha = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
output = open('output.txt', 'w')

for shift in range(1, 27):
  for ch in ct:
    ind = alpha.index(ch)
    output.write(alpha[(ind + shift) % 26])
  output.write('\n') 
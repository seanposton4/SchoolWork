mod = 26
alpha = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
ct = 'THISISATEST'
enc = ['THISISATEST']

dec = [enc[0]]
involutory = []

#Encrypt
for shift in range(1, mod):
  enc.append('')
  for ch in ct:
    ind = alpha.index(ch)
    enc[shift] += alpha[(ind + shift) % mod]

#Shift Again Using Same Shift
for shift in range(1, mod):
  dec.append('')
  currDec = enc[shift]
  for ch in currDec:
    ind = alpha.index(ch)
    dec[shift] += alpha[(ind + shift) % mod]

#Find instances where encrypted ended up back at the start using the same shift
for i in range(len(dec)):
  if dec[i] == ct:
    involutory.append(i)

print(involutory)
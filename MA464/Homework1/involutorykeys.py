# If an encryption function e sub k is identical to a 
# decryption function d sub k, then the key is said to be 
# involutory. Find all involutory keys in the Shift Cipher over Z26.
mod = 29
alpha = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
ct = 'THISISATEST'
enc = [ct]

involutory = []

#Encrypt with double shift
for shift in range(1, mod):
  enc.append('')
  for ch in ct:
    ind = alpha.index(ch)
    enc[shift] += alpha[(ind + shift * 2) % mod]

#Find instances where encrypted ended up back at the start using the double shift
for i in range(len(enc)):
  if enc[i] == ct:
    involutory.append(i)

print(involutory)
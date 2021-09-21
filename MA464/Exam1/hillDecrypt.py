import math
import string
import numpy as np
#Needs key, keyinv, and ct from user.
ct = ''
fileIn = open('MA464/Exam1/hillinput.txt', 'r')
for row in fileIn:
  ct += row
key = [[14, 19, 22], [0, 12, 21], [13, 22, 2]]
keyinv = [[14, 14, 11], [13, 20, 24], [0, 1, 16]]

ctm = []
#print(f'Cipher Text: \n{ct}')
#Change ciphertext to numbers
alpha = list(string.ascii_uppercase)
alphakey = {}
for i in range(26):
  alphakey[alpha[i]] = i
ctn = []
ct = ct.replace(' ', '')
for ch in ct:
  ctn.append(alphakey[ch])

#Break ciphertext into matrix based on key length for multiplication
for i in range(len(ctn)):
  if i % len(key) == 0:
    ctm.append([])
  ctm[math.floor(i / len(key))].append(ctn[i])
#print(ctm)

#Pad String if necessary
if len(ctm[-1]) < 3:
  while len(ctm[-1]) < 3:
    ctm[-1].append('Q')

#print(f'Cipher Text Matrix Numbers: \n{ctm}')

# for i in range(len(ctm)):
#   print(f'{i}: {ctm[i]}')

#Multiply ciphertext matrix by inverse key
ptmn = np.matmul(ctm, keyinv)
pt = ''

#Make multiplied matrix % 26
for i in range(len(ptmn)):
  for j in range(len(ptmn[i])):
    ptmn[i][j] = ptmn[i][j] % 26
#print(f'Plain Text Matrix Numbers: \n{ptmn}')

#Convert plaintext matrix to plaintext
for i in range(len(ptmn)):
  for j in range(len(ptmn[i])):
    pt += list(alphakey.keys())[list(alphakey.values()).index(ptmn[i][j])]

print(f'Plain Text: \n{pt}')
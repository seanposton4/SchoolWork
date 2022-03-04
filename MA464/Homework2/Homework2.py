import string
alpha = list(string.ascii_uppercase)
key = {}
for i in range(26):
  key[alpha[i]] = i

encoded = ['ITM', 'ITI', 'FCKZK', 'TMA', 'JCZZ', 'MMF', 'ZMK', 'MZ']
decoded = []
for encode in encoded:
  decoded.append('')
  for ch in encode:
    decoded[-1] += (str(key[ch]) + ' ')

for keyval in range(len(encoded)):
  print(f'{encoded[keyval]}: {decoded[keyval]}')
import string

asciis = string.ascii_lowercase
key = {}
for i in range(len(asciis)):
  key[asciis[i]] = i

text = 'rupotentoifv'

for i in text:
  print(key[i], end=' ')
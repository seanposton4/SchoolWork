#Test for what values 
testcases = [lambda i,j: ((23 * i) + j) % 26 == 19]
for i in range(26):
  for j in range(26):
    if ((23 * i) + j) % 26 == 19 and ((15 * i) + j) % 26 == 11 and ((3 * i) + j) % 26 == 25 and ((25 * i) + j) % 26 == 21:
      print(f'i: {i}, j: {j}')


#Idempotent Encryptions Calculator
a, b = 7, 6
c, d = 15, 10
num = 25
enc = (((num * a + b) % 26) * c + d) % 26
print(f'Affine Encrypt {num}: {enc}')
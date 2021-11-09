# Retrieve the prime factors of a number n

import math
n = 945859840905737

# Even number divisible
while n % 2 == 0:
   print (2),
   n = n / 2
   
# n became odd
for i in range(3,int(math.sqrt(n))+1,2):
   while (n % i == 0):
      print (i)
      n = n / i
   
if n > 2:
   print (n)
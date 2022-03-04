#Works for Q2 - Q5
n = 0
insertion = lambda n: 10 * n**3
merge = lambda n: 2**n

while insertion(n) >= merge(n):
  n += 1
print(n)
def isOne(p:int, q:int) -> list:
  a = []
  n = p * q
  for i in range(n):
    if (i ** 2) % n == 1:
      a.append(i)
  return a

if __name__ == '__main__':
  p, q = 26981, 62549
  a = isOne(p, q)
  print(a)
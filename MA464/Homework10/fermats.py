def fermats(p: int) -> int:
  pMinusOne = p - 1
  for i in range(2, p):
    if (i ** pMinusOne) % p == 1:
      return i

if __name__ == '__main__':
  p = 31847
  a = fermats(p)
  print(a)
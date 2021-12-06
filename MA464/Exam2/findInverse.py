def findInverse(mod, b):
  #Find an inverse of a number within a given modulus.


  for i in range(mod):
    if (b * i) % mod == 1:
      print(i)
      return True
  return False

if __name__ == '__main__':
  mod = 1687545040
  b = 1019
  print(findInverse(mod, b))
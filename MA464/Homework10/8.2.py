def sam(x, n, m):
  z = 1
  while n > 0:
    if n % 2 == 1:
      z = x*z % m
      n -= 1
    else:
      x = x**2 % m
      n /= 2
  return z

# Part A
def verify(message, alpha, beta, p, y):
  alpha_x = sam(alpha, message, p)
  beta_y1 = sam(beta, y[0], p)
  y1_y2 = sam(y[0], y[1], p)
  ver = (beta_y1 * y1_y2) % p

  if ver == alpha_x:
    return True
  else:
    return False

# Part B
def findPrivate(alpha, beta, p):
  for i in range(p):
    if (alpha ** i) % p == beta:
      return i

# Part C
def findK(alpha, p, y1):
  for k in range(p):
    calc = sam(alpha, k, p)
    if calc == y1:
      return k


if __name__ == '__main__':
  x = 20543
  p = 31847
  alpha = 5
  beta = 26379
  y = [20679, 11082]

  print(f'Part (a): {verify(x, alpha, beta, p, y)}')
  print(f'Part (b): {findPrivate(alpha, beta, p)}')
  print(f'Part (c): {findK(alpha, p, y[0])}')
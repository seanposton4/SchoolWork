def decode(encoded:str) -> str:
  stack = []
  decoded = ''
  for i in encoded:
    if (i == '['):
  return decoded

if __name__ == '__main__':
  encodedExamples = ['2[x]3[mn]', '2[z3[x]]']
  #Should output 'xxmnmnmn' and 'zxxxzxxx'

  print(decode(encodedExamples[0]))
  #print(decode(encodedExamples[1]))
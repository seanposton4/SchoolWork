def decode(encoded:str) -> str:
  stack = []
  stack.append(['', 1])
  times = ''
  for i in encoded:
    if i.isdigit():
      times += i
    elif i == '[':
      stack.append(['', int(times)])
      times = ''
    elif i == ']':
      s, t = stack.pop()
      stack[-1][0] += s*t
    else:
      stack[-1][0] += i
  return stack [0][0]

    

if __name__ == '__main__':
  encodedExamples = ['2[x]3[mn]', '2[z3[x]]']
  #Should output 'xxmnmnmn' and 'zxxxzxxx'

  print(decode(encodedExamples[0]))
  print(decode(encodedExamples[1]))
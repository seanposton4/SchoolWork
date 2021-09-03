def decode(encoded:str) -> str:
  stack = ['']
  decoded = ''
  times = 0

  for i in encoded:
    # This if statement will grab the times to repeat the number.
    # It will be in the range [1, 300], so this will cover the 
    #  case of multiple numbers.
    if i.isdigit():
      times = (times * 10) + int(i)
    elif i == '[':
      stack.append(decoded)
      stack.append(times)
      decoded = ''
      times = 0
    elif i == ']':
      reps = stack.pop()
      prevStr = stack.pop()
      decoded = prevStr + (reps * decoded)
    else:
      decoded += i
    
  return decoded

if __name__ == '__main__':
  encodedExamples = ['2[x]3[mn]', '2[z3[x]]']
  #Should output 'xxmnmnmn' and 'zxxxzxxx'

  print(decode(encodedExamples[0]))
  print(decode(encodedExamples[1]))
# Sean Poston
# 9/2/2021

def decode(encoded:str) -> str:
  stack = ['']
  decoded = ''
  times = 0

  for i in encoded:
    # This if statement will grab the times to repeat the number.
    # It will be in the range [1, 300], so this will cover the 
    # case of multiple numbers.
    if i.isdigit():
      times = (times * 10) + int(i)
    elif i == '[':
    # Adds current repetitions, times, and current value of decoded
    # to the stack to be popped on ']'.
      stack.append(times)
      stack.append(decoded)
      decoded = ''
      times = 0
    # Pops the rightmost value, times, then pops the previous 
    # string to be added on to the string holder.
    elif i == ']':
      decoded = stack.pop() + (decoded * stack.pop())
    # Adds message to decoded character by character.
    else:
      decoded += i
    
  return decoded

if __name__ == '__main__':
  encodedExamples = ['2[x]3[mn]', '2[z3[x]]', '3[ab2[yy2[x]]]']
  #Should output 'xxmnmnmn' and 'zxxxzxxx'

  for encode in encodedExamples:
    print(decode(encode))
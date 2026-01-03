def last2(str):
  last = str[-2:]
  prev = ''
  count = 0
  for c in str[:-1]:
    if prev + c == last:
      count += 1
    prev = c
  return count

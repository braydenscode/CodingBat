def diff21(n):
  result = 0
  if (n > 21):
    result = n - 21
    return result * 2
  elif (n < 21):
    result = 21 - n
    return result
  else:
    return 0
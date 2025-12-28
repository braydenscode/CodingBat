def near_hundred(n):
  if (abs(n - 100) <= 10):
    return True
  elif (abs(n - 200) <= 10):
    return True
  else:
    return False
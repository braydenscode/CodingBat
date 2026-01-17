def end_other(a, b):
  a, b = a.lower(), b.lower()
  return b.endswith(a) or a.endswith(b)
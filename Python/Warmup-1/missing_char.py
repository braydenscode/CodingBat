def missing_char(str, n):
    arr = list(str)
    arr.pop(n)
    return ''.join(arr)

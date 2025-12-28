def front_back(str):
    if (len(str) <= 1):
      return str
    arr = list(str)
    front = arr[0]
    back = arr[-1]
    arr[0] = back
    arr[-1] = front
    return ''.join(arr)
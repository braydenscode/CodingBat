def string_match(a, b):
    if len(a) <= len(b):
        str = a
    else:
        str = b

    count = 0
    for i in range(len(str) - 1):
        if a[i] == b[i] and a[i + 1] == b[i + 1]:
            count += 1
            continue
    return count
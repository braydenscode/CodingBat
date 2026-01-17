def lucky_sum(a, b, c):
    if a == b == c == 13 or a == b == 13 or a == c == 13 or a == 13:
        return 0
    elif b == c == 13 or b == 13:
        return a
    elif c == 13:
        return a + b
    else:
        return a + b + c
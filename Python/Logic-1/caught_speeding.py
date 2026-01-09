def caught_speeding(speed, is_birthday):
    s = speed
    if is_birthday:
        s = speed - 5
    if s <= 60:
        return 0
    elif s >= 61 and s <= 80:
        return 1
    elif s >= 81:
        return 2
    return None
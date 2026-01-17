def count_hi(str):
    result = 0
    last = ""
    for c in str:
        if last == "h" and c == "i":
            result += 1
        last = c
    return result
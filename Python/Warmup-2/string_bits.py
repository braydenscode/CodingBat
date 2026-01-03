def string_bits(str):
    toggle = True
    result = ''
    arr = list(str)
    for c in arr:
        if toggle:
            result += c
        toggle = not toggle
    return result




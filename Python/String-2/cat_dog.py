def cat_dog(str):
    result = 0
    stack = []
    for c in str:
        if c == "t":
            if stack.pop() == "a":
                if stack.pop() == "c":
                    result += 1
        if c == "g":
            if stack.pop() == "o":
                if stack.pop() == "d":
                    result -= 1
        stack.append(c)
    return result == 0
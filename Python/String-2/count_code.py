def count_code(str):
    result = 0
    stack = []
    for c in str:
        if c == "e" and len(str) > 3:
            stack.pop()
            if stack.pop() == "o":
                if stack.pop() == "c":
                    result += 1
        stack.append(c)
    return result
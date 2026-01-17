def make_chocolate(small, big, goal):
    if goal > small + (big * 5) or small < goal % 5:
        return -1
    elif goal // 5 <= big:
        if goal // 5 <= big and small >= goal % 5:
            return goal % 5
    else:
        return goal - big * 5
def make_bricks(small, big, goal):
  if goal // 5 <= big:
    return goal // 5 <= big and small >= goal % 5
  else:
    return (big * 5) + small >= goal
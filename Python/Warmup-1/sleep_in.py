def sleep_in(weekday, vacation):
  if vacation:
    return True
  else:
    if (not weekday):
      return True
    elif (weekday):
      return False
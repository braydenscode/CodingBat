def sum67(nums):
    sum = 0
    counting = True
    for num in nums:
        if num == 6:
            counting = False
        if counting:
            sum += num
        if num == 7:
            counting = True
    return sum
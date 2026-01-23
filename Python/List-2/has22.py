def has22(nums):
    last = None
    for num in nums:
        if last == 2 and num == 2:
            return True
        last = num
    return False
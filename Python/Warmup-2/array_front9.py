def array_front9(nums):
    count = 0
    for n in nums[0:4]:
        if n == 9:
            return True
    return False
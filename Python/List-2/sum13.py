def sum13(nums):
    last = None
    sum = 0
    for num in nums:
        if num == 13 or last == 13:
            last = num
            continue
        sum += num
        last = num
    return sum
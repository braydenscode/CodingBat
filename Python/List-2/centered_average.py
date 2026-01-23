def centered_average(nums):
    sum = 0
    for num in nums:
        sum += num
    return (sum - min(nums) - max(nums)) / (len(nums) - 2)
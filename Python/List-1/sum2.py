def sum2(nums):
    if len(nums) >= 2:
        result = 0
        result += nums[0]
        result += nums[1]
        return result
    elif len(nums) == 1:
        return nums[0]
    else:
      return 0
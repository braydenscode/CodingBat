public int sum2(int[] nums) {
    int result = 0;
    if (nums.length < 2) {
        for(int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    } else {
        return nums[0] + nums[1];
    }
}

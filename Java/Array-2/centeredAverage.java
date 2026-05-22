public int centeredAverage(int[] nums) {
    Arrays.sort(nums);
    int result = 0;
    for(int i = 1; i < nums.length - 1; i++) {
        result += nums[i];
    }
    return result / (nums.length - 2);
}

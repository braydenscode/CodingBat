public int maxSpan(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if(nums[i] == nums[j]) {
                count = Math.max(count, j - i + 1);
            }
        }
    }
    return count;
}

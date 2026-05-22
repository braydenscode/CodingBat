public boolean more14(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 1) count++;
        if(nums[i] == 4) count--;
    }
    return count > 0;
}

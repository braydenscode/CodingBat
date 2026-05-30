public boolean tripleUp(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if(i < nums.length - 2 && nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) return true;
    }
    return false;
}

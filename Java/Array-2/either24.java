public boolean either24(int[] nums) {
    boolean dual2 = false;
    boolean dual4 = false;
    for (int i = 0; i < nums.length - 1; i++) {
        if(nums[i] == 2 && nums[i + 1] == 2) dual2 = true;
        if(nums[i] == 4 && nums[i + 1] == 4) dual4 = true;
    }
    return dual2 && !dual4 || !dual2 && dual4;
}

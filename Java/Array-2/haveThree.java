public boolean haveThree(int[] nums) {
    int threes = 0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 3) {
            threes++;
            if(i > 0 && nums[i - 1] == 3) return false;
        }
    }
    return threes == 3;
}

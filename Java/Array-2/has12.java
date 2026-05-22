public boolean has12(int[] nums) {
    boolean has1 = false;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 1) has1 = true;
        if(has1 && nums[i] == 2) return true;
    }
    return false;
}

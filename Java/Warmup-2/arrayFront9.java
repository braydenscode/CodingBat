public boolean arrayFront9(int[] nums) {
    int l = nums.length;
    if (l >= 4) {
        l = 4;
    }

    for(int i = 0; i < l; i++) {
        if (nums[i] == 9) {
            return true;
        }
    }
    return false;
}

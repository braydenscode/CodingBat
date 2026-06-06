public int[] fix34(int[] nums) {
    int prev;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 3) {
            for (int j = i; j < nums.length; j++) {
                if(nums[j] == 4 && nums[j - 1] != 3) {
                    prev = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = prev;
                    break;
                }
            }
        }
    }
    return nums;
}

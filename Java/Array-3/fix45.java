public int[] fix45(int[] nums) {
    int prev;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 4) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == 5) {
                    if(j == 0 || nums[j - 1] != 4) {
                        prev = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = prev;
                        break;
                    }
                }
            }
        }
    }
    return nums;
}

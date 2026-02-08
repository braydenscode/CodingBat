public int array667(int[] nums) {
    int last = 0;
    int count = 0;
    for(int i = 0; i < nums.length; i++) {
        if(last == 6) {
            if(nums[i] == 6 || nums[i] == 7) {
                count++;
            }
        }
        last = nums[i];
    }
    return count;
}

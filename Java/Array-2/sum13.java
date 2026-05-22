public int sum67(int[] nums) {
    int result = 0;
    boolean toggle = true;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 6) {
            toggle = false;
        }
        if(toggle) {
            result += nums[i];
        }
        if(nums[i] == 7 && toggle == false) {
            toggle = true;
        }
    }
    return result;
}
public boolean modThree(int[] nums) {
    int evenInRow = 0;
    int oddInRow = 0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0) {
            evenInRow++;
            oddInRow = 0;
        } else if (nums[i] % 2 == 1) {
            oddInRow++;
            evenInRow = 0;
        }
        if(oddInRow == 3 || evenInRow == 3) return true;
    }
    return false;
}

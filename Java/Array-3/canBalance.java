public boolean canBalance(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        int sum2 = 0;
        for (int j = i + 1; j < nums.length; j++) {
            sum2 += nums[j];
        }
        if(sum == sum2) return true;
    }
    return false;
}

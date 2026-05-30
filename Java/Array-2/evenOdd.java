public int[] evenOdd(int[] nums) {
    int[] arr = new int[nums.length];
    int start = 0;
    int end = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 1) {
            arr[end] = nums[i];
            end--;
        } else {
            arr[start] = nums[i];
            start++;
        }
    }
    return arr;
}

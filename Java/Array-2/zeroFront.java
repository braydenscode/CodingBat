public int[] zeroFront(int[] nums) {
    int[] arr = new int[nums.length];
    int start = 0;
    int end = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 0) {
            arr[start] = 0;
            start++;
        } else {
            arr[end] = nums[i];
            end--;
        }
    }
    return arr;
}

public int[] withoutTen(int[] nums) {
    int[] arr = new int[nums.length];
    int start = 0;
    int end = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 10) {
            arr[end] = 0;
            end--;
        } else {
            arr[start] = nums[i];
            start++;
        }
    }
    return arr;
}

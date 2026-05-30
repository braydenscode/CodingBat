public int[] post4(int[] nums) {
    int numIndexes = nums.length - 1;
    for (int i = numIndexes; i >= 0; i--) {
        if(nums[i] == 4) {
            int[] arr = new int[numIndexes - i];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = nums[j + i + 1];
            }
            return arr;
        }
    }
    return new int[0];
}
public int[] pre4(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] == 4) {
            int[] arr = new int[i];
            for (int j = 0; j < i; j++) {
                arr[j] = nums[j];
            }
            return arr;
        }
    }
    return new int[0];
}

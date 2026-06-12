public int[] copyEvens(int[] nums, int count) {
    int arrI = 0;
    int[] arr = new int[count];
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0) {
            arr[arrI] = nums[i];
            arrI++;
        }
        if(arrI == count) break;
    }
    return arr;
}

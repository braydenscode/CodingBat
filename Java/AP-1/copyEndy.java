public int[] copyEndy(int[] nums, int count) {
    int[] arr = new int[count];
    int arrI = 0;
    for (int i = 0; i < nums.length; i++) {
        if(isEndy(nums[i])) {
            arr[arrI] = nums[i];
            arrI++;
        }
        if(arrI == count) break;
    }
    return arr;
}

public boolean isEndy(int n) {
    return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}
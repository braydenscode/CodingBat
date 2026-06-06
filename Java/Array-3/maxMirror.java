public int maxMirror(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length - 1; j >= 0; j--) {
            int count = 0;
            int ii = i;
            int jj = j;
            while(ii < nums.length && jj >= 0 && nums[ii] == nums[jj]) {
                count++;
                ii++;
                jj--;
            }
            if(count > result) {
                result = count;
            }
        }
    }
    return result;
}

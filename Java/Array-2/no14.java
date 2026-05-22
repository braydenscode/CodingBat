public boolean no14(int[] nums) {
    boolean no1 = true;
    boolean no4 = true;
    for (int num : nums) {
        if(num == 1) no1 = false;
        if(num == 4) no4 = false;
    }
    return no1 || no4;
}

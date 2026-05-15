public int maxBlock(String str) {
    int count = 1;
    int max = 1;
    if(str.length() == 0) return 0;
    for(int i = 0; i < str.length() - 1; i++) {
        if(str.charAt(i) == str.charAt(i + 1)) {
            count++;
        } else {
            count = 1;
        }
        max = Math.max(max, count);
    }
    return max;
}

public int[] biggerTwo(int[] a, int[] b) {
    int aSum = 0;
    int bSum = 0;
    for(int i = 0; i < a.length; i++) {
        aSum += a[i];
        bSum += b[i];
    }
    if (aSum >= bSum) {
        return a;
    } else {
        return b;
    }
}

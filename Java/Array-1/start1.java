public int start1(int[] a, int[] b) {
    int result = 0;
    if (a.length >= 1 && a[0] == 1) {
        result++;
    }
    if (b.length >= 1 && b[0] == 1) {
        result++;
    }
    return result;
}

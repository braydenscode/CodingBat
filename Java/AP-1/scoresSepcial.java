public int scoresSpecial(int[] a, int[] b) {
    return largestSpecial(a) + largestSpecial(b);
}

public int largestSpecial(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 10 == 0) max = Math.max(arr[i], max);
    }
    return max;
}

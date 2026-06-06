public int[] squareUp(int n) {
    int[] arr = new int[n*n];
    for (int i = 0; i < n; i++) {
        int start = i * n;
        int end = start + (n - 1);
        int value = 1;
        for (int j = 0; j < i + 1; j++) {
            arr[end - j] = value;
            value++;
        }
    }
    return arr;
}

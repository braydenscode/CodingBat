public String[] mergeTwo(String[] a, String[] b, int n) {
    int i = 0;
    int j = 0;
    String[] arr = new String[n];
    int arrI = 0;

    while(arrI < n) {
        int compare = a[i].compareTo(b[j]);
        if(compare <= 0) {
            arr[arrI] = a[i];
            i++;
            arrI++;
            if(compare == 0) j++;
        } else if (compare > 0) {
            arr[arrI] = b[j];
            j++;
            arrI++;
        }
    }
    return arr;
}

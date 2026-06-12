public int commonTwo(String[] a, String[] b) {
    int result = 0;
    int i = 0;
    int j = 0;

    while(i < a.length && j < b.length) {
        int compare = a[i].compareTo(b[j]);
        if(compare < 0) {
            i++;
        } else if (compare > 0) {
            j++;
        } else {
            result++;
            String val = a[i];

            while(i < a.length && a[i].equals(val)) i++;
            while(j < b.length && b[j].equals(val)) j++;
        }
    }
    return result;
}

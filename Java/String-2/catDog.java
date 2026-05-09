public boolean catDog(String str) {
    int count = 0;
    for (int i=0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).equals("cat")) {
            count++;
        } else if (str.substring(i, i + 3).equals("dog")) {
            count--;
        }
    }
    return count == 0;
}

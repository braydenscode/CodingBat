public String everyNth(String str, int n) {
    String result = "";
    for(int i = 0; i < str.length(); i++) {
        if (i % n == 0) {
            result += str.charAt(i);
        }
    }
        return result;
}

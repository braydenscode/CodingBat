public String stringBits(String str) {
    String result = "";
    for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (i % 2 == 0) {
            result += c;
        }
    }
    return result;
}

public String mixString(String a, String b) {
    int length = a.length() > b.length() ? a.length() : b.length();
    String result = "";
    for(int i = 0; i < length; i++) {
        if (a.length() > i) {
            result = result.concat(a.substring(i, i + 1));
        }
        if (b.length() > i) {
            result = result.concat(b.substring(i, i + 1));
        }
    }
    return result;
}

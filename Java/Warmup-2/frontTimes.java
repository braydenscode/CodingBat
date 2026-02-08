public String frontTimes(String str, int n) {
    String result = "";
    String string = "";
    if (str.length() > 2) {
        string = str.substring(0, 3);
    } else {
        string = str;
    }

    for(int i = 0; i < n; i++) {
        result += string;
    }
    return result;
}

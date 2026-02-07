public String endUp(String str) {
    int length = str.length();
    if (length < 3) {
        return str.toUpperCase();
    }
    String front = str.substring(0, length - 3);
    String end = str.substring(length - 3, length);
    return front + end.toUpperCase();
}

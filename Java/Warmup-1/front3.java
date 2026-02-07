public String front3(String str) {
    String a;
    if (str.length() >= 3) {
        a = str.substring(0, 3);
    } else {
        a = str;
    }
    return a + a + a;
}

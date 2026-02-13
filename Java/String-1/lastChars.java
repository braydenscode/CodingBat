public String lastChars(String a, String b) {
    if (a.equals("")) {
        a = "@@";
    }
    if (b.equals("")) {
        b = "@@";
    }
    return a.substring(0, 1) + b.substring(b.length() - 1);
}

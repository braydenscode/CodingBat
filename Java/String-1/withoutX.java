public String withoutX(String str) {
    if (str.length() > 0 && str.substring(0, 1).equals("x")) {
        str = str.substring(1);
    }
    if (str.length() > 0 && str.substring(str.length() - 1).equals("x")) {
        str = str.substring(0, str.length() - 1);
    }
    return str;
}

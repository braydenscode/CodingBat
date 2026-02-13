public String withoutX2(String str) {
    if (str.equals("x")) {
        return "";
    }
    if (str.length() > 0 && str.substring(0, 1).equals("x") && str.substring(1, 2).equals("x")) {
        return str.substring(2);
    }
    if (str.length() > 1 && str.substring(0, 1).equals("x")) {
        return str.substring(1);
    }
    if (str.length() > 0 && str.substring(1, 2).equals("x")) {
        return str.substring(0, 1) + str.substring(2);
    }
    return str;
}

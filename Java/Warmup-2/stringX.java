public String stringX(String str) {
    if (str.length() <= 2) {
        return str;
    }

    String front = str.substring(0, 1);
    String back = str.substring(str.length() - 1);

    return front + str.substring(1, str.length() - 1).replaceAll("x", "") + back;
}

public String deFront(String str) {
    if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
        return str;
    } else if (str.substring(0, 1).equals("a")) {
        return "a" + str.substring(2);
    } else if (str.substring(1, 2).equals("b")) {
        return "b" + str.substring(2);
    }
    return str.substring(2);
}

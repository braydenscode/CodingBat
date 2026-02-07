public String delDel(String str) {
    if (str.length() <= 3) {
        return str;
    }
    if (str.substring(1, 4).equals("del")) {
        return str.replace("del", "");
    }
    return str;
}

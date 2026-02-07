public String startOz(String str) {
    if (str.length() >= 2) {
        if (str.substring(0,2).equals("oz")) {
            return "oz";
        } else if (str.substring(0,1).equals("o")) {
            return "o";
        } else if (str.substring(1,2).equals("z")) {
            return "z";
        } else {
            return "";
        }
    } else if (str.length() == 1 && str == "o") {
        return str;
    }
    return str;
}

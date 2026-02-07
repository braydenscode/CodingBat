public String front22(String str) {
    String front = "";
    if (str.length() >= 2) {
        front = str.substring(0,2);
        return front + str + front;
    } else if (str.length() == 1) {
        front = str.substring(0,1);
        return front + str + front;
    } else {
        return str;
    }

}

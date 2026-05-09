public boolean xyBalance(String str) {
    for (int i=0; i < str.length(); i++) {
        if (str.substring(i, i + 1).equals("x")) {
            if(!str.substring(i + 1).contains("y")) {
                return false;
            }
        }
    }
    return true;
}

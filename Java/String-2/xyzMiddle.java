public boolean xyzMiddle(String str) {
    for(int i = 0; i < str.length() - 2; i++) {
        if(str.substring(i, i + 3).equals("xyz")) {
            if(Math.abs(str.substring(0, i).length() - str.substring(i + 3).length()) < 2) {
                return true;
            }
        }
    }
    return false;
}

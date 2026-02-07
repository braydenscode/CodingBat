public boolean startHi(String str) {
    if (str.length() < 2) {
        return false;
    } else {
        String first = str.substring(0, 2);
        if (first.equals("hi")) {
            return true;
        }
        return false;
    }
}

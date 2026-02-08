boolean doubleX(String str) {
    int index = str.indexOf('x');

    if(index == -1 || index + 1 >= str.length()) {
        return false;
    }

    return str.substring(index, index + 2).equals("xx");
}

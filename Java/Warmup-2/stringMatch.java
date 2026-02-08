public int stringMatch(String a, String b) {
    String str = "";
    if (a.length() <= b.length()) {
        str = a;
    } else {
        str = b;
    }


    int count = 0;
    for(int i = 0; i < str.length() - 1; i++) {
        if(a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
            count++;
        }
    }
    return count;
}

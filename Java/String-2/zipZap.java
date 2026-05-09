public String zipZap(String str) {
    String result = "";
    for(int i = 0; i < str.length(); i++) {
        if(str.length() > i + 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
            result += "zp";
            i += 2;
        } else {
            result += str.charAt(i);
        }
    }
    return result;
}

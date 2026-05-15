public String mirrorEnds(String string) {
    String result = "";
    for(int i = 1; i <= string.length(); i++) {
        if(string.substring(0, i).equals(new StringBuilder(string.substring(string.length() - i)).reverse().toString())) {
            result = string.substring(0, i);
        }
    }
    return result;
}

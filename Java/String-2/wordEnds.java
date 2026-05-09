public String wordEnds(String str, String word) {
    String result = "";
    for(int i = 0; i <= str.length() - word.length(); i++) {
        if(str.substring(i, i + word.length()).equals(word)) {
            if(i > 0) {
                result += str.charAt(i - 1);
            }
            if(str.length() > i + word.length()) {
                result += str.charAt(i + word.length());
            }
        }
    }
    return result;
}

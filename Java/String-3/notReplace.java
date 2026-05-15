public String notReplace(String str) {
    String result = "";
    for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
            boolean leftCheck = i == 0 || !Character.isLetter(str.charAt(i - 1));
            boolean rightCheck = i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2));
            if(leftCheck && rightCheck) {
                result += "is not";
                i += 1;
                continue;
            }
        }
        result += str.charAt(i);
    }
    return result;
}

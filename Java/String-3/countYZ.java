public int countYZ(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
        if(i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
            if (str.charAt(i) == 'y' ||
                    str.charAt(i) == 'z' ||
                    str.charAt(i) == 'Y' ||
                    str.charAt(i) == 'Z') {
                count++;
            }
        }
    }
    return count;
}

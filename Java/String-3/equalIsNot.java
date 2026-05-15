public boolean equalIsNot(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 's') {
            if(str.charAt(i - 1) == 'i') {
                count++;
            }
        }
        if(str.charAt(i) == 't') {
            if(str.charAt(i - 1) == 'o') {
                if(str.charAt(i - 2) == 'n')
                    count--;
            }
        }
    }
    return count == 0;
}

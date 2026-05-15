public int sumNumbers(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
        if(Character.isDigit(str.charAt(i))) {
            int j = i;
            while(j < str.length() && Character.isDigit(str.charAt(j))) {
                j++;
            }
            count += Integer.parseInt(str.substring(i, j));
            i = j - 1;
        }
    }
    return count;
}

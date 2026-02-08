public String altPairs(String str) {
    String result = "";
    for(int i = 0; i < str.length(); i++) {
        if(i % 4 == 2 || i % 4 == 3) {
            continue;
        }
        result += str.substring(i, i + 1);
    }
    return result;
}

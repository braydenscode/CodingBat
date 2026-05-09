public String oneTwo(String str) {
    String result = "";
    for (int i = 0; i <= str.length() - 3; i += 3) {
        String a = str.substring(i, i + 1);
        String b = str.substring(i + 1, i + 2);
        String c = str.substring(i + 2, i + 3);
        result += b + c + a;
    }
    return result;
}

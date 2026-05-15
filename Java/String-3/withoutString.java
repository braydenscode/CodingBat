public String withoutString(String base, String remove) {
    String result = "";
    for(int i = 0; i < base.length(); i++) {
        if(base.length() >= i + remove.length() && base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase())) {
            i += remove.length() - 1;
        } else {
            result += base.charAt(i);
        }
    }
    return result;
}

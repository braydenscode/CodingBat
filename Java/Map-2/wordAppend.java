public String wordAppend(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    String result = "";
    for(String s:strings) {
        if(map.get(s) != null) {
            map.put(s, map.get(s) + 1);
        } else {
            map.put(s, 1);
        }

        if(map.get(s) % 2 == 0) {
            result += s;
        }
    }
    return result;
}


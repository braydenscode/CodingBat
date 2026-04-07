public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> boolMap = new HashMap<>();
    Map<String, Integer> intMap = new HashMap<>();

    for(String s:strings) {
        if(intMap.get(s) != null) {
            intMap.put(s, intMap.get(s) + 1);
        } else {
            intMap.put(s, 1);
        }

        if(intMap.get(s) >= 2) {
            boolMap.put(s, true);
        } else {
            boolMap.put(s, false);
        }
    }
    return boolMap;
}

public Map<String, Boolean> wordMultipleOptimized(String[] strings) {
    Map<String, Boolean> boolMap = new HashMap<>();
    for(String s:strings) {
        if(boolMap.get(s) != null) {
            boolMap.put(s, true);
        } else {
            boolMap.put(s, false);
        }
    }
    return boolMap;
}
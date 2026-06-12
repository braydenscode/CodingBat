public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    for (String word : words) {
        if(!word.equals(target)) count++;
    }
    String[] arr = new String[count];
    int arrI = 0;
    for (int i = 0; i < words.length; i++) {
        if(!words[i].equals(target)) {
            arr[arrI] = words[i];
            arrI++;
        }
        if(arrI == count) break;
    }
    return arr;
}

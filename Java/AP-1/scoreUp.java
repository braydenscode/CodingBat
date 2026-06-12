public int scoreUp(String[] key, String[] answers) {
    int grade = 0;
    for (int i = 0; i < key.length; i++) {
        if(key[i].equals(answers[i])) {
            grade += 4;
        } else if (!answers[i].equals("?")) {
            grade -= 1;
        }
    }
    return grade;
}

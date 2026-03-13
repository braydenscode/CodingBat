public int makeChocolate(int small, int big, int goal) {
    if (goal > small + big * 5 || goal - Math.min(big, goal / 5) * 5 > small) {
        return -1;
    }
    return goal - Math.min(big, goal / 5) * 5;
}
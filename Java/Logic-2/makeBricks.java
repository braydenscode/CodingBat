public boolean makeBricks(int small, int big, int goal) {
    if (goal / 5 <= big) {
        return goal / 5 <= big && small >= goal % 5;
    }
    return big * 5 + small >= goal;
}

public boolean twoAsOne(int a, int b, int c) {
    if (a == b + c || c == a + b || b == a + c) return true;
    return false;
}

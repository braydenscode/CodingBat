public boolean shareDigit(int a, int b) {
    int aL = a / 10;
    int aR = a % 10;
    int bL = b / 10;
    int bR = b % 10;
    return (aL == bL || aL == bR || aR == bL || aR == bR);
}

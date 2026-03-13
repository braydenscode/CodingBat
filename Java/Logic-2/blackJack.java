public int blackjack(int a, int b) {
    return Math.max(bust(a), bust(b));
}

public int bust(int n) {
    if (n > 21) return 0;
    return n;
}
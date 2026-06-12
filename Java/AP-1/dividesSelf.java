public boolean dividesSelf(int n) {
    int nCopy = n;
    while(n > 0) {
        int last = n % 10;
        if(last == 0 || nCopy % last != 0) return false;
        n /= 10;
    }
    return true;
}

public int userCompare(String aName, int aId, String bName, int bId) {
    int result = 0;
    if(aName.compareTo(bName) >= 1) {
        result++;
    } else if (aName.compareTo(bName) <= -1) {
        result--;
    }
    if(result == 0) {
        if(aId > bId) {
            result++;
        } else if (bId > aId) {
            result--;
        }
    }
    return result;
}

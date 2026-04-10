public List<Integer> rightDigit(List<Integer> nums) {
    nums.replaceAll(n -> n >= 10 ? n % 10 : n);
    return nums;
}

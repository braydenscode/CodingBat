public String[] fizzBuzz(int start, int end) {
    String[] arr = new String[end - start];
    for (int i = 0; i < arr.length; i++) {
        int val = start + i;
        if(val % 3 == 0 && val % 5 == 0) {
            arr[i] = "FizzBuzz";
        } else if(val % 3 == 0) {
            arr[i] = "Fizz";
        } else if (val % 5 == 0) {
            arr[i] = "Buzz";
        } else {
            arr[i] = String.valueOf(val);
        }
    }
    return arr;
}

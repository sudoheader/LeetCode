class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(numDigits(num[i]) % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    static int numDigits(int n) {
        int count = 0;
        while(n < 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

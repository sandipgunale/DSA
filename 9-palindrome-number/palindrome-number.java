class Solution {
    public boolean isPalindrome(int x) {
        int real = x;
        int sum = 0;
        if (x < 0){
            return false;
        }
        while (x != 0){
            sum = (sum * 10) + (x % 10);
            x /= 10;
        }
       return real == sum;
    }
}
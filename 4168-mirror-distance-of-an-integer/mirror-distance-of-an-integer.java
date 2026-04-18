class Solution {
    public int reverse(int num){
        int res = 0;
        while(num > 0 ){
            int dig = num % 10;
            res = (res * 10) + dig;
            num /= 10;
        }
        return res;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

}
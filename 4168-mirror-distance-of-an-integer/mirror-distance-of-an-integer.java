class Solution {
    public int reverse(int num){
        int res = 0;
        while(num > 0 ){
            res = (res * 10) + (num % 10);
            num /= 10;
        }
        return res;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }

}
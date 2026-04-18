1class Solution {
2    public int reverse(int num){
3        int res = 0;
4        while(num > 0 ){
5            res = (res * 10) + (num % 10);
6            num /= 10;
7        }
8        return res;
9    }
10    public int mirrorDistance(int n) {
11        return Math.abs(n - reverse(n));
12    }
13
14}
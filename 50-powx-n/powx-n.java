class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        double ans = pow(x, N);
        
        return n < 0 ? 1 / ans: ans;
     }
    
    private double pow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
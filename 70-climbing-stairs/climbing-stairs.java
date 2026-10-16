class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return possible(0, n, dp);
    }

    public int possible(int step, int n, int[] dp){
        if(step > n) return 0;

        if(step == n) return 1;

        if(dp[step] != -1) return dp[step];

        int one = possible(step+1, n, dp);

        int two = possible(step+2, n, dp);

        dp[step] = one + two;

        return one + two;
    }
}
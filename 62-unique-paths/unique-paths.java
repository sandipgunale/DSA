class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[101][101];

        for(int[] a : dp) Arrays.fill(a, -1);

        return find(m, n, 1, 1, dp);
    }

    public int find(int m, int n, int r, int c, int[][] dp){

        if(r > m || c > n ) return 0;

        if(r == m && c == n) return 1;

        if(dp[r][c] != -1) return dp[r][c];

        int down = find(m, n, r + 1, c, dp);

        int right = find(m, n, r, c + 1, dp);
        
        return dp[r][c] = down + right;

    }
}
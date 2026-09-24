class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        
        int p = -100000;
        int j = s.indexOf(c);
        
        for (int i = 0; i < n; i++) {
            if (i > j) {
                p = j;
                j = s.indexOf(c, i);
                if (j == -1) {
                    j = 100000;
                }
            }
            
            int d1 = i - p;
            int d2 = j - i;
            
            ans[i] = Math.min(d1, d2);
        }
        
        return ans;
    }
}

class Solution {
    public int countCommas(int n) {
        int commas = 0;
        for(int i = 1000; i <= n; i++){
            commas += (i >= 1000 && i < 1000000) ? 1 : (i >= 1000000 && i < 1000000000) ? 2 : 0;
        }
        return commas;
    }
}
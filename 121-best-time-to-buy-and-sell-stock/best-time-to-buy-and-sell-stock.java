class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxP = 0;
        for(int n : prices){
            if(buy > n){
                buy = n;
            }
            int p = n - buy;
            if(p > maxP){
                maxP = p;
            }
        }
        return maxP;
    }
}
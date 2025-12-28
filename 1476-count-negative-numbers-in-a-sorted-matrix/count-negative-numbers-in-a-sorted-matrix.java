class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] num : grid){
            for(int n : num){
                if(n < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
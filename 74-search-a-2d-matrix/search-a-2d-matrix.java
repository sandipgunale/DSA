class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] num : matrix){
            for(int n : num){
                if(n == target){
                    return true;
                }
            }
        }
        return false;
    }
}
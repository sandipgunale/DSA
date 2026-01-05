class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = matrix[i][j];
                sum += Math.abs(value);
                if (value < 0) negativeCount++;
                minAbsValue = Math.min(minAbsValue, Math.abs(value));
            }
        }

        if (negativeCount % 2 == 0) return sum;
        return sum - 2 * minAbsValue;
    }
}
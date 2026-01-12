class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n];
        long[] suffixMin = new long[n];
        prefixSum[0] = nums[0];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        long maxScore = Long.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            maxScore = Math.max(maxScore, prefixSum[i] - suffixMin[i + 1]);
        }
        return maxScore;
    }
}
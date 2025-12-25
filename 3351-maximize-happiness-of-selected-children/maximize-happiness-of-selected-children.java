class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int n = happiness.length;
        for (int i = 0; i < k; i++) {
            sum += Math.max(0, happiness[n - 1 - i] - i);
        }
        return sum;
    }
}
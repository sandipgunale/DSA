class Solution {
    public int maximumCount(int[] nums) {

        int n = nums.length;

        int low = 0, high = n - 1;
        int firstNonNegative = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= 0) {
                firstNonNegative = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = n - 1;
        int firstPositive = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > 0) {
                firstPositive = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int negatives = firstNonNegative;
        int positives = n - firstPositive;

        return Math.max(negatives, positives);
    }
}
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, minRemovals = n;
        for (int i = 0; i < n; i++) {
            long target = (long) nums[i] * k; // Use long to prevent overflow
            int j = binarySearch(nums, target, i, n - 1);
            minRemovals = Math.min(minRemovals, n - (j - i + 1));
        }
        return minRemovals;
    }

    private int binarySearch(int[] nums, long target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }
}
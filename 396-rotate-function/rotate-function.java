class Solution {
    public int maxRotateFunction(int[] nums) {
    int n = nums.length;
    int total = 0, F = 0;
    for (int i = 0; i < n; i++) {
        total += nums[i];
        F += i * nums[i];
    }
    int res = F;
    for (int k = 1; k < n; k++) {
        F = F + total - n * nums[n - k];
        res = Math.max(res, F);
    }
    return res;
}
}
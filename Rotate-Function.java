1class Solution {
2    public int maxRotateFunction(int[] nums) {
3    int n = nums.length;
4    int total = 0, F = 0;
5    for (int i = 0; i < n; i++) {
6        total += nums[i];
7        F += i * nums[i];
8    }
9    int res = F;
10    for (int k = 1; k < n; k++) {
11        F = F + total - n * nums[n - k];
12        res = Math.max(res, F);
13    }
14    return res;
15}
16}
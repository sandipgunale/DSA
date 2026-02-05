class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int steps = nums[i] % n;
            int targetIndex = (i + steps + n) % n;
            result[i] = nums[targetIndex];
        }
        return result;
    }
}
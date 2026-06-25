class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int totalProduct = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                result[i] = totalProduct / nums[i];
            }
        }

        return result;
    }
}
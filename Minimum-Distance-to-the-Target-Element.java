1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int d = Integer.MAX_VALUE;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] == target) {
7                int distance = Math.abs(i - start);
8                d = Math.min(d, distance);
9            }
10        }
11
12        return d;
13    }
14}
1class Solution {
2    public int totalHammingDistance(int[] nums) {
3        int total = 0;
4        int n = nums.length;
5        for (int bit = 0; bit < 32; bit++) {
6            int ones = 0;
7            for (int num : nums) {
8                if ((num & (1 << bit)) != 0) {
9                    ones++;
10                }
11            }
12            int zeros = n - ones;
13            total += ones * zeros;
14        }
15        return total;
16
17    }
18}
1class Solution {
2    public int binaryGap(int n) {
3        String binary = Integer.toBinaryString(n);
4        int maxDistance = 0, prev = -1;
5        for (int i = 0; i < binary.length(); i++) {
6            if (binary.charAt(i) == '1') {
7                if (prev != -1) maxDistance = Math.max(maxDistance, i - prev);
8                prev = i;
9            }
10        }
11        return maxDistance;
12    }
13}
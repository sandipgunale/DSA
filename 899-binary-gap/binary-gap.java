class Solution {
    public int binaryGap(int n) {
        int prev = -1, maxDistance = 0, position = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (prev != -1) maxDistance = Math.max(maxDistance, position - prev);
                prev = position;
            }
            position++;
            n >>= 1;
        }
        return maxDistance;
    }
}
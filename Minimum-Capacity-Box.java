1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) {
3        int minCapacity = Integer.MAX_VALUE, minIndex = -1;
4        for (int i = 0; i < capacity.length; i++) {
5            if (capacity[i] >= itemSize && capacity[i] < minCapacity) {
6                minCapacity = capacity[i];
7                minIndex = i;
8            }
9        }
10        return minIndex;
11    }
12}
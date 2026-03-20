1class Solution {
2    public int findRadius(int[] houses, int[] heaters) {
3        int radius = 0;
4
5        for (int house : houses) {
6            int minDist = Integer.MAX_VALUE;
7
8            for (int heater : heaters) {
9                int dist = Math.abs(house - heater);
10                minDist = Math.min(minDist, dist);
11            }
12
13            radius = Math.max(radius, minDist);
14        }
15
16        return radius;
17    }
18}
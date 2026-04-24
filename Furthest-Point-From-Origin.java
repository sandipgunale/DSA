1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int L = 0, R = 0, underscore = 0;
4
5        for (char ch : moves.toCharArray()) {
6            if (ch == 'L') L++;
7            else if (ch == 'R') R++;
8            else underscore++;
9        }
10
11        return Math.abs(L - R) + underscore;
12    }
13}
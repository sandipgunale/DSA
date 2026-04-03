1class Solution {
2    public int findComplement(int num) {
3        int mask = 0;
4        int temp = num;
5        while (temp > 0) {
6            mask = (mask << 1) | 1;
7            temp >>= 1;
8        }
9        return num ^ mask;
10    }
11}
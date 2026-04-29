1class Solution {
2    public boolean validDigit(int n, int x) {
3        String num = Integer.toString(n);
4        char ch = (char) (x + '0');
5
6        if(num.charAt(0) != ch && num.contains("" + ch)){
7            return true;
8        }
9        return false;
10    }
11}
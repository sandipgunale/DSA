class Solution {
    public boolean validDigit(int n, int x) {
        String num = Integer.toString(n);
        char ch = (char) (x + '0');

        if(num.charAt(0) != ch && num.contains("" + ch)){
            return true;
        }
        return false;
    }
}
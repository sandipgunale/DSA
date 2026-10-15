class Solution {
    public int removePalindromeSub(String s) {
        boolean check = isPal(s);

        return check ? 1 : 2;
    }

    public boolean isPal(String s){
        int l = 0;
        int r = s.length() - 1;

        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
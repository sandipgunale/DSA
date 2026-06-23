class Solution {
    public int reverse(int x) {
        long res = 0;
        if(x < 0){
            String str = String.valueOf(x);
            String rev = new StringBuilder(str).reverse().toString();
            res = Long.parseLong("-"+rev.substring(0, rev.length() - 1));
        }
        else{
            String str = String.valueOf(x);
            String rev = new StringBuilder(str).reverse().toString();
            res = Long.parseLong(rev); 
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ?  0 : (int)res;
    }
    
}
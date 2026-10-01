class Solution {
    public String reversePrefix(String w, char c) {
        int r = w.indexOf(c);
        
        if (r == -1) {
            return w;
        }
        
        char[] a = w.toCharArray();
        int l = 0;
        
        while (l < r) {
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        
        return new String(a);
    }
}

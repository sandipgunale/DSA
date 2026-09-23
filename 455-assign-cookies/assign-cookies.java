import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;

        for (int cookieSize : s) {
            if (i == g.length) {
                break;
            }
            if (cookieSize >= g[i]) {
                i++;
            }
        }
        
        return i;
    }
}

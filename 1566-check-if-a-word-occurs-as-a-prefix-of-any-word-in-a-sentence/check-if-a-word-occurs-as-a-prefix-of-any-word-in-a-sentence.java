class Solution {
    public int isPrefixOfWord(String s, String w) {
        int n = s.length();
        int m = w.length();
        int idx = 1;
        int i = 0;

        while (i < n) {
            int p1 = i;
            int p2 = 0;

            while (p1 < n && p2 < m && s.charAt(p1) == w.charAt(p2)) {
                p1++;
                p2++;
            }

            if (p2 == m) {
                return idx;
            }

            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
            
            i++;
            idx++;
        }

        return -1;
    }
}

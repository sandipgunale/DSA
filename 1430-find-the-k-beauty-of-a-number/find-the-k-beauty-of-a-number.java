class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            if (windowEnd - windowStart + 1 == k) {
                int subNum = Integer.parseInt(s.substring(windowStart, windowEnd + 1));
                if (subNum != 0 && num % subNum == 0) {
                    count++;
                }
                windowStart++;
            }
        }
        return count;
    }
}
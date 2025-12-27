class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = 0;
        boolean oddFound = false;

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        for (int freq : count) {
            length += (freq / 2) * 2;
            if (freq % 2 == 1) {
                oddFound = true;
            }
        }

        return oddFound ? length + 1 : length;
    }
}
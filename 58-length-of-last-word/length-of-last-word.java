class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int len = words.length;
        String last = words[len - 1];
        return last.length();
    }
}
class Solution {
    public int isPrefixOfWord(String s, String w) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(w)) {
                return i + 1;
            }
        }
        return -1;
    }
}

class Solution {
    public String reverseWords(String s) {
        String[] result = s.trim().split("\\s+");
        String str = "";

        for(int i = result.length - 1; i >= 0; i--){
            str = str + result[i] + " ";
        }

        return str.trim();
    }
}
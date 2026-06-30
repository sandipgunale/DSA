class Solution {
    public String reverseWords(String s) {
        String[] result = s.trim().split("\\s+");
        int l = 0;
        int r = result.length - 1;

        while(l < r){
            String temp = result[l];
            result[l] = result[r];
            result[r] = temp;
            l++;
            r--;
        }

        String str = String.join(" ", result);
        return str;
    }
}
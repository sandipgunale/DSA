class Solution {
    public String largestEven(String s) {
        int lastEvenIndex = -1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') lastEvenIndex = i;
            result.append(s.charAt(i));
        }
        return lastEvenIndex == -1 ? "" : result.substring(0, lastEvenIndex + 1);
    }
}
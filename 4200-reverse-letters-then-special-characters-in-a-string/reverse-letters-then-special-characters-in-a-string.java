class Solution {
    public String reverseByType(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder specials = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) letters.append(c);
            else specials.append(c);
        }
        letters.reverse();
        specials.reverse();
        StringBuilder result = new StringBuilder();
        int l = 0, sp = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) result.append(letters.charAt(l++));
            else result.append(specials.charAt(sp++));
        }
        return result.toString();
    }
}
class Solution {
    public int vowelConsonantScore(String s) {
        int vowels = 0, consonants = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        return consonants > 0 ? vowels / consonants : 0;
    }
}
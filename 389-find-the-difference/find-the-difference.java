class Solution {
    public char findTheDifference(String s, String t) { 
        HashMap<Character, Integer> freq = new HashMap<>();
        
 
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) - 1);
            if (freq.get(c) < 0) {
                return c;
            }
        }
        return ' ';
    }
}
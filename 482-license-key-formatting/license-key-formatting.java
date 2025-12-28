class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') cleaned.append(Character.toUpperCase(c));
        }

        StringBuilder result = new StringBuilder();
        int length = cleaned.length();
        int firstGroup = length % k;

        if (firstGroup > 0) {
            result.append(cleaned.substring(0, firstGroup)).append("-");
        }

        for (int i = firstGroup; i < length; i += k) {
            result.append(cleaned.substring(i, i + k)).append("-");
        }

        if (result.length() > 0) result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
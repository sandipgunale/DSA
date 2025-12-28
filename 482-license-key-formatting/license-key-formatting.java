class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        StringBuilder result = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i > 0 && (length - i) % k == 0) {
                result.append("-");
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
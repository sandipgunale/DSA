class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, c = 0;
        while (i >= 0 || j >= 0 || c != 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = n1 + n2 + c;
            sb.append(sum % 10);
            c = sum / 10;
        }
        return sb.reverse().toString();
    }
}
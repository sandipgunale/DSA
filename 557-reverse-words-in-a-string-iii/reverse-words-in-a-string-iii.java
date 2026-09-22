class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        
        for (int j = 0; j <= n; j++) {
            if (j == n || arr[j] == ' ') {
                rev(arr, i, j - 1);
                i = j + 1;
            }
        }
        
        return new String(arr);
    }
    
    private void rev(char[] arr, int l, int r) {
        while (l < r) {
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}

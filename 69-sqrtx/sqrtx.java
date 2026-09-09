class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int low = 1;
        int high = x;
        int temp = 0;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            long r = (long)mid*mid;
            if (r == x) {
                return mid;
            }
            else if(r < x){
                temp = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return temp;
    }
}
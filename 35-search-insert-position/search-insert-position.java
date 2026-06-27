class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int pos = n;

        int l = 0;
        int r = n - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] >= target){
                pos = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return pos;
    }
}
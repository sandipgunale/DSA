class Solution {
    public void sortColors(int[] nums) {
        int s = 0, e = nums.length - 1;
        int i = 0;

        while(i <= e){
            if(nums[i] == 0){
                int t = nums[s];
                nums[s] = nums[i];
                nums[i] = t;

                s++;
                i++;
            }

            else if(nums[i] == 2){
                int t = nums[e];
                nums[e] = nums[i];
                nums[i] = t;

                e--;
            }
            else{
                i++;
            }
        }
    }
}
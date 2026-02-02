class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int indx = 0; indx < nums.length; indx++){
            int n = indx + 1;
            if(nums[indx] != n){
                result.add(nums[indx]);
            }
        }
        return result;
    }
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
}
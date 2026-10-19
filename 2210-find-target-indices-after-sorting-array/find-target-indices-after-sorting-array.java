class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int less = 0;
        int equal = 0;
        for(int n : nums){
            if(n < target) less++;
            else if(n == target) equal++;
        }
        if(equal != 0){
            for(int i = 0; i < equal; i++){
                l.add(less + i);
            }
        }

        return l;
    }
}
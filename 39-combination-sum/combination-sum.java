class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
     List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        combinationSumHelper(arr, target, 0, res, ans);
        return ans;
    }

   public static void combinationSumHelper(int[] arr, int target, int index, List<Integer> res, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(target < 0){
            return;
        }

        for(int i = index; i < arr.length; i++){
            res.add(arr[i]);
            combinationSumHelper(arr, target - arr[i], i, res, ans);
            res.remove(res.size() - 1);
        }
    }
}
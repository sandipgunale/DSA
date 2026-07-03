class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        arrange(ans, nums, l);
        return l;

    }
     public static void arrange(List<Integer> ans, int[] arr, List<List<Integer>> l){
        if(ans.size() == arr.length){
            l.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(ans.contains(arr[i])){
                continue;
            }
            ans.add(arr[i]);
            arrange(ans, arr, l);
            ans.remove(ans.size() - 1);
        }
    }
}
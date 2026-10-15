class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        sum(0, target, candidates, res, ans);

        return res;
    }

    public void sum(int idx, int t, int[] c, List<List<Integer>> res, List<Integer> ans){
        
        

        if(t == 0){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(idx == c.length || t < 0){
            return;
        }

        ans.add(c[idx]);

        sum(idx, t - c[idx], c, res, ans);

        ans.remove(ans.size() - 1);

        sum(idx + 1, t, c, res, ans);

    }
}
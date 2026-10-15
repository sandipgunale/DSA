class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> ans = new ArrayList<>();


        find(0, target, candidates, res, ans);

        return res;
    }

    public void find(int i, int t, int[] c, List<List<Integer>> res, List<Integer> ans){

        if(t == 0){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(i == c.length || t < 0) return;

        ans.add(c[i]);

        //include
        find(i, t - c[i], c, res, ans);

        ans.remove(ans.size() - 1);

        //Not include(Skip)
        find(i + 1, t, c, res, ans);

    }
}
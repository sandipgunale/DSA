import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(hm.keySet());
        keys.sort((a, b) -> hm.get(b) - hm.get(a));

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = keys.get(i);
        }

        return ans;
    }
}
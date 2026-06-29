class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int maxPile = 0;
        // for (int pile : piles) {
        //     maxPile = Math.max(maxPile, pile);
        // }
        Arrays.sort(piles);
        int l = 1, r = piles[piles.length - 1];
        while (l < r) {
            int speed = l + (r - l) / 2;
            int totalHours = 0;
            
            for (int pile : piles) {
                totalHours += Math.ceil((double) pile / speed);
            }
            
            if (totalHours <= h) {
                r = speed; 
            } else {
                l = speed + 1; 
            }
        }
        
        return l;
    }
}
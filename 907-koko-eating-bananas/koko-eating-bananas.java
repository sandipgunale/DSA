class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mp = 0;
        for (int p : piles) {
            mp = Math.max(mp, p);
        }

        // for (int speed = 1; speed <= maxPile; speed++) {
        //     int totalHours = 0;
        //     for (int pile : piles) {
        //         totalHours += Math.ceil((double) pile / speed);
        //     }

        //     if (totalHours <= h) {
        //         return speed;
        //     }
        // }

        int l = 1, r = mp;
        int ans = 0;
        while (l <= r) {
            int s = l + (r - l) / 2;
            int th = 0;
            
            for (int p : piles) {
                th += Math.ceil((double) p / s);
            }
            
            if (th <= h) {
                ans = s;
                r = s - 1; 
            } else {
                l = s + 1; 
            }
        }
        return ans;
    }
}
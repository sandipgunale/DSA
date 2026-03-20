class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int radius = 0;

        for (int house : houses) {
            int minDist = Integer.MAX_VALUE;

            for (int heater : heaters) {
                int dist = Math.abs(house - heater);
                minDist = Math.min(minDist, dist);
            }

            radius = Math.max(radius, minDist);
        }

        return radius;
    }
}
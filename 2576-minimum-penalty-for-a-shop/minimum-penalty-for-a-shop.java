class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int penalty = 0, minPenalty = 0, bestHour = 0;

        for (int i = 0; i < n; i++) {
            penalty += customers.charAt(i) == 'Y' ? -1 : 1;
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }
        return bestHour;
    }
}
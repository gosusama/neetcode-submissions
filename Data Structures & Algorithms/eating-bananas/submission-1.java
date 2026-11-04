class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPile = 0;
        
        for (int i = 0; i < n; i++) {
            if (piles[i] > maxPile) {
                maxPile = piles[i];
            }
        }

        int l = 1;
        int r = maxPile;

        while (l < r) {
            int m = l + (r - l) / 2;

            int totalHours = 0;
            for (int pile : piles) {
                totalHours += (pile - 1) / m + 1;
                if (totalHours > h) {
                    break;
                }
            }

            if (totalHours > h) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return l;
    }
}

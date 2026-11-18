
class Solution {

    boolean is_possible(int[] piles, int h, int mid) {
        long count = 0;

        for (int i = 0; i < piles.length; i++) {

            count += (piles[i] + (long) mid - 1) / mid;

            if (count > h) {
                return false;
            }
        }

        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = 0;

        for (int i = 0; i < piles.length; i++) {
            r = Math.max(r, piles[i]);
        }

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (is_possible(piles, h, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1; int e = 1000000000;
        int ans = e;
        while(s <= e){
            int m = s + (e - s) / 2;
            long hoursSpent = 0;
            for (int pile : piles) {
                hoursSpent += Math.ceil((double) pile / m);
            }
            if(hoursSpent <= h){
                ans = m;
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return ans;
    }
}
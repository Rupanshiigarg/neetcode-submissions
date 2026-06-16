class Solution {
    public int f(int x, int[] coin, int[] dp){
        if(x==0) return 0;
        if(x<0) return 1000000;
        if(dp[x] != -1) return dp[x];
        int ans = 1000000;
        for(int c : coin){
             ans = Math.min(ans, 1 + f(x-c, coin, dp));
        }
        return dp[x] = ans;
        
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
         int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = f(amount, coins, dp);
        return ans >= 1000000 ? -1 : ans;
    }
}

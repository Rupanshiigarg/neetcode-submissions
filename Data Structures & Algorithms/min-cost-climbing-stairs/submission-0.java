class Solution {
    public int funC(int x, int[] dp, int[] cost){
        // base
        if(x>= cost.length) return 0;
         if(dp[x]!= -1) return dp[x];
         // recursion
         int y = funC(x+1, dp, cost);
         int z = funC(x+2, dp, cost);
         return dp[x]= cost[x] + (Math.min(y , z));

    }
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int[] dp = new int[n+1];
          Arrays.fill(dp, -1);
          return Math.min(funC(0, dp, cost), funC(1, dp,  cost));
    }
}

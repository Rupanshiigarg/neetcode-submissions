class Solution {
   public int funC(int x, int[] dp){
       
       if(x==1|| x==0) return 1;
        if(dp[x] != -1) return dp[x];    
       // recursion
       int ls = funC(x-1, dp);
       int ls1 = funC(x-2, dp);
      // return 
      return dp[x] = ls+ls1;
        }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
     Arrays.fill(dp, -1);
      return funC(n, dp);
    }
}

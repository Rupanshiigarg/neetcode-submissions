class Solution {
    public int f(int x, int[] dp, int[] nums){
        if(x>= nums.length) return 0;
        if(dp[x]!=-1) return dp[x];
         int y = nums[x] + f(x+2, dp, nums);
         int z = f(x+1, dp, nums);
         return dp[x] = (Math.max(y, z));
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return f(0, dp, nums);
    }
}

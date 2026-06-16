class Solution {
    public int f(int x, int[] dp, int[] nums, int end )    
    {
        if(x>end) return 0;
        if(dp[x]!=-1) return dp[x];
         int y = nums[x] + f(x+2, dp, nums, end);
         int z = f(x+1, dp, nums, end);
         return dp[x] = (Math.max(y, z));
    }
    public int rob(int[] nums) {
         int n = nums.length;

        if (n == 1) return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = f(0, dp1, nums, n - 2); // exclude last
        int case2 = f(1, dp2, nums, n - 1); // exclude first

        return Math.max(case1, case2);
    }
}

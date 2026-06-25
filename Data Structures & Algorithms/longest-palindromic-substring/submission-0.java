class Solution {
    public boolean f(int i, int j, String s, int[][] dp){
     if (i >= j) return true;

        if (dp[i][j] != -1)
            return dp[i][j] == 1;
      if(s.charAt(i) == s.charAt(j) && f(i+1, j-1, s, dp)){
            dp[i][j] = 1;
            return true;
      }
      else{
        dp[i][j] = 0;
        return false;
      }

    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        String ans = "";
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(f(i, j, s, dp)){
                    if(j-i+1 >ans.length()){
                        ans = s.substring(i, j+1);
                    }
                }
            }
        }
        return ans;
    }
}

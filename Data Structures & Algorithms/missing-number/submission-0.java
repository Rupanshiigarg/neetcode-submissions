class Solution {
    public int missingNumber(int[] nums) {
        int Asum = 0; 
        int n = nums.length;

        int sum = (n*(n+1)/2);
        for(int i=0; i<nums.length; i++){
            Asum += nums[i];
        }
        return sum - Asum;
    }
}

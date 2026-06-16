class Solution {
    public int maxProduct(int[] nums) {

        int ans = nums[0];

        int prod = 1;
        for (int x : nums) {
            prod *= x;
            ans = Math.max(ans, prod);

            if (prod == 0) prod = 1;
        }

        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prod *= nums[i];
            ans = Math.max(ans, prod);

            if (prod == 0) prod = 1;
        }

        return ans;
    }
}
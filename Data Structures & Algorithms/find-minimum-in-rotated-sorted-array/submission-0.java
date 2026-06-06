class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0; int e = n-1;
       
        int ans = 0;
         while(s<= e){
            int m = s + (e-s)/2;
            if(nums[m] <= nums[n-1]){
                ans = m;
                e = m-1;
            }
            else{
                s = m+1;
            }

         }
         return nums[ans];
    }
}

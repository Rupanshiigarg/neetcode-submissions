class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long N = n;
        if(N<0){
            x = 1/x;
            N= -N;
        }
       for(int i = 0; i<N; i++){
       ans *= x;
       }
       return ans;
    }
}

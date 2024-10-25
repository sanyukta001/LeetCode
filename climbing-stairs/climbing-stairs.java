class Solution{
    int dp[];
    int climb(int n){
        if(n <= 1)
        {
            dp[n] = n;
            return n;
        }
        if(dp[n]!=-1)
            return dp[n];
        dp[n] = climb(n-1)+climb(n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
        dp = new int[n+2];
        Arrays.fill(dp,-1);
        return climb(n+1);
    }
}
//nb=
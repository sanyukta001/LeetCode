class Solution {
    long dp[][] = new long[4001][1001];//[4001][1001];
    long calcSteps(int curr, int dest, int k)
    {
        if(k == 0 && curr == dest)
            return 1;
        if(k==0)
            return 0;
        if(dp[curr+1000][k] != -1)
            return dp[curr+1000][k];
        long x = calcSteps(curr+1,dest,k-1) + calcSteps(curr-1,dest,k-1);
        dp[curr+1000][k] = x%1000000007;
        return x%1000000007;
    }
    public int numberOfWays(int startPos, int endPos, int k) {
        //dp = new int[4001][1001];
        for(long[] a: dp)
        {
            Arrays.fill(a,-1);
        }
        long ans = calcSteps(startPos, endPos, k);
        return (int)(ans%1000000007);
    }
}
//nb=
class Solution {
    int[][] dp = new int[1001][1001];
    public int kInversePairs(int n, int k) {
        // int[][]dp = new int[1001][1001];
        // for(int[] a: dp)
        //     Arrays.fill(a,1);
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++)
        {
            long val = 0;
            for(int j = 0; j <= k; j++)
            {
                val+= dp[i-1][j];
                if(j>=i)
                    val-=dp[i-1][j-i];
                dp[i][j] = (int) (val%1000000007);
                // for(int i = 0; i <= Math.min(y,x-1);i++)
                // {
                //     dp[x][y] = (dp[x][y]+dp[x-1][y-i])%1000000007;
                // }
            }
        }
        return dp[n][k];
    }
    // int kInverse(int n, int k){
    //     if(n == 0)
    //         return 0;
    //     if(k == 0)
    //         return 1;
    //     if(dp[n][k]!=-1)
    //         return dp[n][k];
    //     else{
    //     dp[]
    //     for(int i = 0; i <= Math.min(k,n-1); i++)
    //     {
    //         c=(c+kInverse(n-1,k-i))%1000000007;
    //     }
    //     dp[n][k] = (int)c%1000000007;
    //     return dp[n][k];
    //     }
    // }
}
//nb=
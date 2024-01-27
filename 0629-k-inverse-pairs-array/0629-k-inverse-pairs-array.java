class Solution {
    int[][] dp = new int[1001][1001];
    public int kInversePairs(int n, int k) {
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
            }
        }
        return dp[n][k];
    }
}
//nb=
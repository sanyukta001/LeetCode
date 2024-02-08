class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        for(int i = 1; i < n+1; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                int sq = j*j;
                if(i - sq < 0)
                    break;
                dp[i] = Math.min(dp[i], 1+dp[i-sq]);
            }
            // dp[i] = i*i;
            // if(i*i == n)
            //     return 1;
            // if(i*i > n)
            //     break;
        }
        return dp[n];
        
    }
}
//nb=
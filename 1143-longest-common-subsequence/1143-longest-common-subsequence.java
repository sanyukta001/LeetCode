class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String s1, String s2) {
        dp = new int[s1.length()+1][s2.length()+1];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        for(int i = 0; i <= s1.length(); i++)
            dp[i][0] = 0;
        for(int i = 0; i <= s2.length(); i++)
            dp[0][i] = 0;
        for(int i = 1; i <= s1.length(); i++)
        {
            for(int j = 1; j <= s2.length(); j++)
            {
                if(dp[i][j]!=-1)
                    return dp[i][j];
                if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                    // return dp[index1][index2];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    // return dp[index1][index2];
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
//nb=
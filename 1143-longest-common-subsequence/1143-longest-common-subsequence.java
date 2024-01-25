class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        return find(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
    int find(String s1, String s2, int index1, int index2, int[][]dp)
    {
        if(index1 == -1 || index2 == -1)
            return 0;
        if(dp[index1][index2]!=-1)
                return dp[index1][index2];
        if(s1.charAt(index1) == s2.charAt(index2))
        {
            // return 1+find(s1,s2,index1-1,index2-1);
            dp[index1][index2] = 1+find(s1,s2,index1-1,index2-1,dp);
            return dp[index1][index2];
        }
        else
        {
            dp[index1][index2] = Math.max(find(s1,s2,index1-1,index2,dp),find(s1,s2,index1,index2-1,dp));
                return dp[index1][index2];
        }
    }
}
//nb=
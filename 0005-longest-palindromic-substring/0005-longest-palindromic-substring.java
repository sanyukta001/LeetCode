class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        int[][] dp = new int[l][l];
        int max = 0;
        String res = "";
        for(int diff=0;diff<l;diff++)
        {
            for(int i=0,j=diff+i; j<l;i++,j++)
            {
                if(i==j)
                    dp[i][j] = 1;
                else if(j<i)
                    continue;
                else
                {
                    if(diff == 1)
                    {
                        if(s.charAt(i)==s.charAt(j))
                            dp[i][j] = 2;
                        else
                            dp[i][j] = 0;
                    }
                    else
                    {
                        if(s.charAt(i) == s.charAt(j))
                        {
                            if(dp[i+1][j-1] != 0)
                                dp[i][j] = dp[i+1][j-1]+2;
                            else
                                dp[i][j] = 0;
                        }
                        else
                            dp[i][j] = 0;
                    }
                }
                if(dp[i][j] > max)
                {
                    max = dp[i][j];
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}
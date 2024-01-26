class Solution {
    int mod = 1000000007;
    int[][][]dp;
    public int findPaths(int m, int n, int maxMove, int i, int j) {
        dp = new int[51][51][51];
        for (int deck = 0; deck < dp.length; deck++) 
        {
            for (int row = 0; row < dp[deck].length; row++) 
            {
                for (int col = 0; col < dp[deck][row].length; col++) 
                {
                    dp[deck][row][col] = -1;
                }
            }
        }

        return (int)(findP(m,n,maxMove,i,j)%mod);
    }
    long findP(int m, int n, int maxMove, int i, int j){
        long count = 0;
        if(i<0||i>=m||j<0||j>=n)
            return 1;
        if(maxMove <= 0)
            return 0;
        if(dp[i][j][maxMove] != -1)
            return dp[i][j][maxMove];
        count += findP(m,n,maxMove-1,i-1,j);
        count += findP(m,n,maxMove-1,i+1,j);
        count += findP(m,n,maxMove-1,i,j+1);
        count += findP(m,n,maxMove-1,i,j-1);
        dp[i][j][maxMove] = (int)(count%mod);
        return dp[i][j][maxMove];    
    }
}
//nb=
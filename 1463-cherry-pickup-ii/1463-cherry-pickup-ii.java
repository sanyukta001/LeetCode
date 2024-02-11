class Solution {
    public int cherryPickup(int[][] grid) {
        int m =  grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][n];
        for(int[][] x:dp)
        {
            for(int[]y:x)
            {
                Arrays.fill(y,-1);
            }
        }
        return find(0,0,n-1,grid,m,n,dp);
    }
    int find(int i , int j1, int j2, int[][]grid, int m,int n,int[][][]dp)
    {
        if(j1<0||j1>=n||j2<0||j2>=n)
            return Integer.MIN_VALUE;
        if(i == m-1)
        {
            if(j1 == j2)
                return grid[i][j1];
            else
                return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1)
            return dp[i][j1][j2];
        int maxi = Integer.MIN_VALUE;
        for(int di = -1; di <= 1; di++)
        {
            int res = 0;
            for(int dj = -1; dj <= 1; dj++)
            {
                if(j1 == j2)
                    res = grid[i][j1] ;//+ find(i,j1+di,j2+dj,grid,m,n);
                else
                    res = grid[i][j1]+grid[i][j2];//+find(i,j1+di,j2+dj,grid,m,n);
                res += find(i+1,j1+di,j2+dj,grid,m,n,dp);
                maxi = Math.max(maxi,res);
            }
        }
        dp[i][j1][j2] = maxi;
        return maxi;
    }
}
//nb=
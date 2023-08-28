// class Solution {
//     public int[][] onesMinusZeros(int[][] grid) {
        
//     }
// }
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int diff[][] = new int[r][c];
        int a[] = new int[r];
        int b[] = new int[c];
        // int[] oi = new int[r];
        // int[] zi = new int[r];
        // int[] oj = new int[c];
        // int[] zj = new int[c];
        for(int i = 0 ; i < r;i++)
        {
            int s = 0 , p = 0;
            for(int j = 0 ; j < c;j++)
            {
                if(grid[i][j] == 0)
                    s++;
                else
                    p++;
            }
            a[i] = p-s;
            // oi[i] = p;
            // zi[i] = s;
        }
        for(int i = 0 ; i < c;i++)
        {
            int s = 0 , p = 0;
            for(int j = 0 ; j < r;j++)
            {
                if(grid[j][i] == 0)
                    s++;
                else
                    p++;
            }
            b[i] = p-s;
        }
        for(int i = 0 ; i < grid.length;i++)
        {
            for(int j = 0 ; j < grid[0].length;j++)
            {
                diff[i][j] = a[i] + b[j];
            }
        }
        return diff;
    }
}
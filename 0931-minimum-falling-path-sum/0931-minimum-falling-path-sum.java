class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int res = Integer.MAX_VALUE;
        for(int i = matrix.length-2; i >= 0; i--)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                int a = Integer.MAX_VALUE , b = Integer.MAX_VALUE;
                if(j+1 >= 0 && j+1 < matrix[0].length)
                    a = matrix[i+1][j+1];
                if(j-1 >= 0 && j-1 < matrix[0].length)
                    b = matrix[i+1][j-1];
                int c = matrix[i+1][j];
                matrix[i][j] += Math.min(Math.min(a,b),c); 
                // if(i == 0)
                //     res = Math.min(res, matrix[i][j]);
            }
        }
        for(int i = 0; i < matrix[0].length;i++)
            res = Math.min(res,matrix[0][i]);
        return res;
    }
}
//nb=

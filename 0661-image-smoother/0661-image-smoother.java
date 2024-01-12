class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        int[][] res = new int [row][col];
        for(int i = 0; i < row; i++)
        {
            int sum = 0;
            int count = 0;
            for(int j = 0; j < col; j++)
            {
                sum = 0;
                count = 0;
                int[] r = {-1,0,1};
                for(int l = 0; l < 3; l++)
                {
                    int ri = i+r[l];
                    for(int k = 0; k < 3; k++)
                    {
                        int ci = j+r[k];
                        if(ri >= 0 && ri < row && ci >= 0 && ci < col)
                        {
                            sum += img[ri][ci];
                            count++;
                        }
                    }
                }
//                 sum += img[i][j];
//                 count++;
//                 if(j-1 >= 0 && j-1 < col)
//                 {
//                     sum = sum + img[i][j-1];
//                     count++;
//                 }
//                 if(j+1 >= 0 && j+1 < col)
//                 {
//                     sum = sum + img[i][j+1];
//                     count++;
//                 }
                
//                 if(i-1 >= 0 && i-1 < row)
//                 {
//                     if(j-1 >= 0 && j-1 < col)
//                     {
//                         sum = sum+img[i-1][j-1];
//                         count++;
//                     }
//                     if(j >= 0 && j < col)
//                     {
//                         sum = sum+img[i-1][j];
//                         count++;
//                     }
//                     if(j+1 >= 0 && j+1 < col)
//                     {
//                         sum = sum+img[i-1][j+1];
//                         count++;
//                     }
//                 }
//                 if(i+1 >= 0 && i+1 < row)
//                 {
//                     if(j-1 >= 0 && j-1 < col)
//                     {
//                         sum = sum+img[i+1][j-1];
//                         count++;
//                     }
//                     if(j >= 0 && j < col)
//                     {
//                         sum = sum+img[i+1][j];
//                         count++;
//                     }
//                     if(j+1 >= 0 && j+1 < col)
//                     {
//                         sum = sum+img[i+1][j+1];
//                         count++;
//                     }
//                 }
                res[i][j] = (sum/count);
            }
        }
        return res;
    }
}
//nb=
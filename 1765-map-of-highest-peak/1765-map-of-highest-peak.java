class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int row = isWater.length;
        int col = isWater[0].length;
        int[][] res = new int[row][col];
       for (int[] ro : res) 
            Arrays.fill(ro, Integer.MAX_VALUE);
        Queue<Pair<Integer,Integer>> qp = new LinkedList<>();
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(isWater[i][j] == 1)
                {
                    res[i][j] = 0;
                    qp.add(new Pair<>(i,j));
                    // int dr[] = {0,0,-1,1};
                    // int dc[] = {-1,1,0,0};
                    // for(int k = 0; k <4; k++)
                    // {
                    //     int r = i+dr[k];
                    //     int c = j+dc[k];
                    //     if(r>=0&&r<row&&c>=0&&c<col&&res[r][c]<0)
                    //         res[r][c] = 1+res[i][j];
                    // }
                    
                }
                // else if(res[i][j] < 0)
                //     res[i][j] = 2;
            }
        }
        while(!qp.isEmpty())
        {
             int r = qp.peek().getKey();
             int c = qp.peek().getValue();
             qp.remove();
             int dr[] = {0,0,-1,1};
             int dc[] = {-1,1,0,0};
             for(int k = 0; k <4; k++)
             {
                 int rr = r+dr[k];
                 int cc = c+dc[k];
                 if(rr>=0&&rr<row&&cc>=0&&cc<col&&res[rr][cc]>(1+res[r][c]))
                 {
                     res[rr][cc] = 1+res[r][c];
                     qp.add(new Pair<>(rr,cc));
                 }
             }
            
        }
        return res;
        
    }
}
//nb=
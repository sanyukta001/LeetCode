class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Pair<Integer,Integer>> qp = new LinkedList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(matrix[i][j] == 0)
                    qp.add(new Pair<>(i,j));
            }
        }
        while(!qp.isEmpty())
        {
            int r = qp.peek().getKey();
            int c = qp.peek().getValue();
            qp.remove();
            for(int i = 0; i < col; i++)
                matrix[r][i] = 0;
            for(int i = 0; i < row; i++)
                matrix[i][c] = 0;
        }
    }
}
//nb=
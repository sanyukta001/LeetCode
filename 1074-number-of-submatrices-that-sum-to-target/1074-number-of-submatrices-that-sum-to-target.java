class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++)
            for(int j = 1; j < col; j++)
                matrix[i][j]+=matrix[i][j-1];
        int count = 0;
        for(int i = 0; i < col; i++)
        {
            for(int j = i; j < col; j++)
            {
                Map<Integer,Integer> map = new HashMap<>();
                map.put(0,1);
                int sum = 0;
                for(int r = 0; r < row; r++)
                {
                    sum+=matrix[r][j] - ((i>0)?matrix[r][i-1]:0);
                    if(map.containsKey(sum-target))
                        count+=map.get(sum-target);
                    if(!map.containsKey(sum))
                        map.put(sum,1);
                    else
                        map.put(sum,map.get(sum)+1);
                }
            }
        }
        return count;
    }
}
//nb=
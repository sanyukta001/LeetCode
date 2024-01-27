class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, top = 0,right = col-1, bottom = row-1;
        while(top<=bottom && left<=right)
        {
            for(int i = left; i <= right; i++)
                res.add(matrix[top][i]);
            top++;
            for(int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
}
//nb=
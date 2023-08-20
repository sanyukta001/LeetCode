class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length * matrix[0].length;
        int l =0;
        int u= m-1;
        while(l <= u)
        {
            int mid=(l+u)/2;
            int midp = matrix[mid/matrix[0].length][mid%matrix[0].length];
            if(midp == target)
                return true;
            else if(target > midp)
                l = mid+1;
            else
                u = mid-1;
        }
        return false;
    }
}
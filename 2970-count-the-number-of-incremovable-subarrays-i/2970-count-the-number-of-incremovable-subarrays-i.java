class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int l = nums.length;
        int count = 0;
        for(int i = 0; i < l; i++)
        {
            for(int j = i; j < l; j++)
            {
                if(increaseArray(i,j,nums) == true)
                    count++;
                    
            }
        }
        return count;
    }
    boolean increaseArray(int start, int stop, int[] nums)
    {
        int prev = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i >= start && i <= stop)
                continue;
            if(prev >= nums[i])
                return false;
            prev = nums[i];
        }
        return true;
    }
}
//nb=
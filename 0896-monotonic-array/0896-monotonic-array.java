class Solution {
    public boolean isMonotonic(int[] nums) {
        int f = 1;
        //if(nums[0]>=nums[1])
        //{
            for(int i = 0;i<nums.length-1;i++)
            {
                if(nums[i] < nums[i+1])
                {
                    f = 0;
                    break;
                }
            }
        //}
        int g = 1;
        //if(nums[0] <= nums[1])
        //{
            for(int i = 0;i<nums.length-1;i++)
            {
                if(nums[i] > nums[i+1])
                {
                    g = 0;
                    break;
                }
            }
        //}
        if(f == 1 || g == 1)
        {
            return true;
        }
        else
            return false;
    }
}
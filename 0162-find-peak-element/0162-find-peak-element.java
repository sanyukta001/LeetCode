class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, u = nums.length-1, mid = 0;
        if(u+1 == 1)
            return 0;
        // if(u == 2)
        //     return (nums[0]>nums[1])?0:1;
        // if(nums[l] > nums[l+1])
        //     return 0;
        // if(nums[u] > nums[u-1])
        //     return u;
        while(l<=u)
        {
            if(nums[l] > nums[l+1])
                return l;
            if(nums[u] > nums[u-1])
                return u;
            mid = (l+u)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1])
            {
                l = mid+1;
            }
            else
            {
                u = mid-1;
            }
        }
        return -1;
    }
}
//nb=
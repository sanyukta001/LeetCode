class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, u = nums.length - 1, mid = 0;
        if(nums.length == 1)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[nums.length-1]!= nums[nums.length-2])
            return nums[nums.length-1];
        while(l<=u)
        {
            mid = (l+u)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
                return nums[mid];
            else if(nums[mid] == nums[mid+1])
            {
                if(mid % 2 == 0)
                {
                    l = mid + 1;
                }
                else
                {
                    u = mid -1;
                }
            }
            else if( nums[mid] == nums[mid - 1])
            {
                if(mid % 2 == 0)
                {
                    u = mid - 1;
                }
                else 
                {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
//nb=
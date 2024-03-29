class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, u = nums.length -1, mid = 0;
        int res = nums.length;
        while(l<=u)
        {
            mid = (u+l)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                res = mid;
                u = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        // if(nums[res] == target)
        //     return res;
        // else if(res != nums.length -1)
        //     return res+1;
        // else
            return res;
    }
}
//nb=
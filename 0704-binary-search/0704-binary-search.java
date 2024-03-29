class Solution {
    public int search(int[] nums, int target) {
        int l = 0, u = nums.length - 1, mid = 0;
        while(l<=u)
        {
            mid = (l+u)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                u = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return -1;
    }
}
//nb=
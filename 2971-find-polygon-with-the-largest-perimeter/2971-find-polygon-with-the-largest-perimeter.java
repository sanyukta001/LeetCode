class Solution {
    long totalSum(int[] nums)
    {
        long tot = 0;
        for(int i = 0; i < nums.length; i++)
            tot+=nums[i];
        return tot;
    }
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long total = totalSum(nums);
        for(int i = n-1; i >= 0; i--)
        {
            if(total-nums[i] > nums[i])
                return total;
            total-=nums[i];
        }
        return -1;
    }
}
//nb=
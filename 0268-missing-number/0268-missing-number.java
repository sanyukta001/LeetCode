class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int c = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length;i++)
        {
            c += nums[i];
            // if(nums[i] != c)
            //     return c;
            // else
            //     c++;
            // if(i == nums.length-1 && nums[i]!=c)
            //     return c;
        }
        int sum = n * (n+1)/2;
        return sum-c;
    }
}
//nb=
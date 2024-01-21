class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return find(nums,nums.length-1,dp);
    }
    int find(int[] nums,int index, int[] dp)
    {
        if(index == 0)
        {
            dp[index] = nums[index];
            return dp[index];
        }
        if(index<0)
            return 0;
        if(dp[index] != -1)
            return dp[index];
        int pick = nums[index] + find(nums, index-2,dp);
        int notpick = 0 + find(nums,index-1,dp);
        dp[index] = Math.max(pick,notpick);
        return dp[index];
    }
}
//nb=
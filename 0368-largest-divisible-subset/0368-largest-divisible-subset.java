class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList();
        int[] hash = new int[n]; 
        int[] dp = new int[n];
        int maxi = 0;
        Arrays.sort(nums);
        int lastIndex = 0;
        for(int i = 0; i < n; i++)
        {
            hash[i] = i;
            for(int prev = 0; prev < i; prev++)
            {
                if(nums[i] % nums[prev] == 0 && 1 + dp[prev] > dp[i])
                {
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
            }
            if(dp[i] > maxi)
            {
                maxi = dp[i];
                lastIndex = i;
            }
        }
        res.add(nums[lastIndex]);
        while(hash[lastIndex] != lastIndex)
        {
            lastIndex = hash[lastIndex];
            res.add(nums[lastIndex]);
        }
        return res;
    }
}
//nb=
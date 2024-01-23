class Solution {
    public int subarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        int count = 0;
        int sum = 0;
        while(i<nums.length)
        {
            sum += nums[j];
            j++;
            if(sum == k)
                count++;
            if(j == nums.length)
            {
                i++;
                j = i;
                sum = 0;
            }
            
        }
        return count;
    }
}
//nb=
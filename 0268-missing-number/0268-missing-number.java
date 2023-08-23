class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i] != c)
                return c;
            else
                c++;
            // if(i == nums.length-1 && nums[i]!=c)
            //     return c;
        }
        return c;
    }
}
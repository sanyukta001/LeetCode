class Solution {
    public void moveZeroes(int[] nums) {
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                int k = i+1;
                int x = -1; 
                for(int j = k;j<nums.length;j++)
                {
                    if(nums[j]!=0)
                    {
                        x = j;
                        break;
                    }
                }
                if(x == -1)
                    break;
                int t = nums[i];
                nums[i] = nums[x];
                nums[x] = t;
            }
        }
    }
}
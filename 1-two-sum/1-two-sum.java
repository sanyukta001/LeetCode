class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int a[] = new int[2];
        int y = -1;
        int i = 0;
        for(i = 0; i < nums.length; i++)
        {
            int x = target - nums[i];
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] == x && j!=i)
                {
                    y = j;
                    break;
                }
            }
            if(y != -1)
                break;
        }
        a[0] = i;
        a[1] = y;
        return a;
        
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Arrays.sort(nums);
        ArrayList <Integer> res = new ArrayList<Integer>();
        // int k = 1;
        // for(int i =0;i<nums.length;i++)
        // {
        //     if((i>0)&&(nums[i] == nums[i-1]))
        //         continue;
        //     if(nums[i]!=k)
        //     {
        //         res.add(k);
        //         k++;
        //     }
        //     else
        //         k++;
        // }
        
        for(int i=0;i<nums.length;i++)
        {
            int x = Math.abs(nums[i])-1;
            if(nums[x] > 0)
                nums[x] = 0-nums[x];
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]>0)
                res.add(i+1);
        }
        return res;
    }
}
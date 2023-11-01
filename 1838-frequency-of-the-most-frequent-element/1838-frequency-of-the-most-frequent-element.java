class Solution {
    public int maxFrequency(int[] nums, long k) {
        Arrays.sort(nums);
        // int sum = 0;
        int i = 0, j = 0;
        for(j = 0;  j < nums.length;j++)
        {
            k  += nums[j];
            if(k < (long)nums[j]*(j-i+1))
            {
                k = k - nums[i];
                i++;
            }
        }
        return j-i;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int max_freq = 0;
        // int sl = nums[0];
        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(!map.containsKey(nums[i]))
        //     {
        //         map.put(nums[i],1);
        //         if(map.get(nums[i])>=max_freq)
        //             max_freq = map.get(nums[i]);
        //     }
        //     else
        //     {
        //         map.put(nums[i],map.get(nums[i])+1);
        //         if(map.get(nums[i])>=max_freq)
        //             max_freq = map.get(nums[i]);
        //     }
        // }
    }
}
//nb=
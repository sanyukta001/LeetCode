class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
                nums[k++] = nums[i];
            }
        }
        // int k = 0; 
        // for(Map.Entry<Integer,Integer> entry: map.entrySet())
        // {
        //     nums[k++] = entry.getKey();
        // }
        return k;
    }
}
//nb=
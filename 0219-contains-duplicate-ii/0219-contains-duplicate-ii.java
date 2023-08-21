class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }
            else
            {
               int d = Math.abs(map.get(nums[i])-i);
                if(d<=k)
                    return true;
                else
                    map.put(nums[i],i);
            }
        }
        return false;
    }
}
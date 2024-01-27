class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> set = new HashMap<>();
        set.put(0,1);
        int prefixSum = 0;
        int count=0;
        for(int i = 0; i < nums.length; i++)
        {
            prefixSum+=nums[i];
            if(set.containsKey(prefixSum-k))
                count+=set.get(prefixSum-k);
            if(!set.containsKey(prefixSum))
                set.put(prefixSum,1);
            else
                set.put(prefixSum,set.get(prefixSum)+1);
        }
        return count;
    }
}
//nb=
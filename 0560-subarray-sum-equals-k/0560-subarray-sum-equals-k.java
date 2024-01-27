class Solution {
    public int subarraySum(int[] nums, int k) {
//         int i = 0, j = 0;
//         int count = 0;
//         int sum = 0;
//         while(i<nums.length)
//         {
//             sum += nums[j];
//             j++;
//             if(sum == k)
//                 count++;
//             if(j == nums.length)
//             {
//                 i++;
//                 j = i;
//                 sum = 0;
//             }
            
//         }
//         return count;
        
        // HashSet<Integer> set = new HashSet();
        Map<Integer,Integer> set = new HashMap<>();
        // set.add(0);
        set.put(0,1);
        int prefixSum = 0;
        int count=0;
        for(int i = 0; i < nums.length; i++)
        {
            prefixSum+=nums[i];
            // if(set.contains(prefixSum-k))
            //     count++;
            // set.add(prefixSum);
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
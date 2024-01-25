class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // List<List<Integer>> list = new ArrayList();
//         list.add(new ArrayList());
//         int sum = 0;
//         int[] arr = new int[k];
//         if(nums.length ==  k)
//             return nums;
//         for(int i = 0; i < nums.length; i++)
//         {
//             int x = list.size();
//             for(int j = 0; j < x; j++)
//             {
//                 List<Integer> l = new ArrayList(list.get(j));
//                 l.add(nums[i]);
//                 list.add(l);
            
//                 if(l.size()==k)
//                 {
//                     int s = 0;
//                     for(int y = 0; y < k; y++)
//                         s += l.get(y);
//                     if(sum<s)
//                     {
//                         sum = s;
//                         for(int y = 0; y < k; y++)
//                         {
//                             arr[y] = l.get(y);
//                         }
//                     }
//                 }
                
//             }
//         }
//         return arr;
        
        int x = 0;
        int[] copy = new int[nums.length];
        Map<Integer,Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
            copy[i]  = nums[i];
        Arrays.sort(copy);
        int[] res = new int[k];
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(x<nums.length-k)
            {
                x++;
                continue;              
            }
            // res[j++] = copy[i];
            if(!map.containsKey(copy[i]))
               map.put(copy[i],1);
             else
               map.put(copy[i],map.get(copy[i])+1);
        }
        j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
               res[j++] = nums[i];
                if(map.get(nums[i])==1)
                    map.remove(nums[i]);
                else
                    map.put(nums[i],map.get(nums[i])-1);
            }
        }
        return res;
    }
}
//nb=
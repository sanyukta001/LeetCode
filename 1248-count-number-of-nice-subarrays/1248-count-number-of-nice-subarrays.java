class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();
        // int niceCount = 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     for(int j = i; j < nums.length; j++)
        //     {
        //         if(j-i+1 >= k)
        //         {
        //             int oddCount = 0;
        //             int x = i;
        //             while(x<=j)
        //             {
        //                 if(nums[x]%2!=0)
        //                     oddCount++;
        //                 x++;
        //             }
        //             if(oddCount == k){
        //                 niceCount++;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return niceCount;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]%2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int niceCount = 0;
        // map.put(0,1);
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            if(sum==k)
                niceCount++;
            if(map.containsKey(sum-k))
            {
                niceCount+=map.get(sum-k);
            }
            if(!map.containsKey(sum))
                map.put(sum,1);
            else
                map.put(sum,map.get(sum)+1);
        }
        return niceCount;
    }
}
//nb=
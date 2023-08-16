class Solution {
    public int thirdMax(int[] nums) {
//         int x = nums.length-1;
//         int max = Integer.MIN_VALUE;
//         int[] arr=new int[3];
//         int k = 0;
//         while(k!=3)
//         {
//             for(int i = 0; i<x;i++)
//             {
//                 if(k == 0)
//                 {
//                     if(max<nums[i])
//                         max = nums[i];
//                     if(x<3)
//                         return max;
//                 }
//                 else if(k == 1)
//                 {
//                     if(nums[i]!=arr[0] && max<nums[i])
//                         max = nums[i];
//                 }
//                 else
//                 {
//                     if(nums[i]!=arr[0] && nums[i]!=arr[1] && max<nums[i])
//                         max = nums[i];
//                 }
//             }
//             arr[k++] = max;
//             max = Integer.MIN_VALUE;
//         }
//         return arr[2];
        
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        for(int i = 0; i<nums.length;i++)
        {
            h.put(nums[i],1);
            //m++;
        }
        int i = 0;
        int m = h.size();
        int[] arr = new int[m];
        for(Map.Entry<Integer,Integer> set :h.entrySet())
        {
            arr[i++] = set.getKey();
        }
        
       Arrays.sort(arr);
        if(m<3)
            return arr[m-1];
        else
            return arr[m-3];
            
        
        // max = mi-1;
        // int k = 0;
        // while(k!=3)
        // {
        //     for (Map.Entry<Integer,Integer> set :h.entrySet()) 
        //     {
        //         int x = set.getKey();
        //     if(k == 0)
        //     {
        //         if(max<x)
        //             max = x;
        //     }
        //     else if(k == 1)
        //     {
        //         if(x!=arr[0] && max<x)
        //             max = x;
        //     }
        //     else
        //     {
        //         if(x!=arr[0] && x!=arr[1] && max<x)
        //             max = x;
        //     }
        // }
        //     arr[k++] = max;
        //     max = mi-1;
        // }
        // }
        // return arr[2];
    }
}
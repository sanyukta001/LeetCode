class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        // int start = -1;
        // int stop = -1;
        if(arr.length == 0)
            return 0;
        int curr = arr[0];
        int c = 1;
        int max = 1;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == curr+1)
            {
                curr = arr[i];
                c++;
            }
            if(arr[i] > curr+1)
            {
                curr = arr[i];
                c = 1;
            }
            max = Math.max(max,c);
                
        }
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     start = i;
        //     stop = i;
        //     while(stop+1 < nums.length && nums[stop]+1 == nums[stop+1])
        //         stop++;
        //     if(stop +1 < nums.length && nums[stop+1] != nums[stop])
        //         max = Math.max(max,stop-start+1);
        // }
        return max;
    }
}
//nb=
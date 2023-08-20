class Solution {
    // int get(int[] arr, int x)
    // {
    //     for(int i = x; i < arr.length;i++)
    //     {
    //         if(arr[i] == -1)
    //             return i;
    //     }
    //     return -1;
    // }
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        // Arrays.fill(res,-1);
        for(int i=0; i<index.length;i++)
        {
            
                for(int j = res.length-1;j > index[i]; j--)
                {
                    res[j] = res[j-1];
                }
                res[index[i]] = nums[i];
        }
        return res;
    }
}
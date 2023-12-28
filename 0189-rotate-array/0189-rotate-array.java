class Solution {
    public void rotate(int[] nums, int k) {
        // while(k-->0)
        // {
        //     int x = nums[nums.length-1];
        //     for(int i = nums.length-1; i >= 1; i--)
        //     {
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = x;
        // }
        int n = nums.length;
        if(n>1)
        {
            while(n < k)
                k = k-n;
            int x = 0;
            int[] arr = new int [n];
            for(int j = n-k; j < n; j++)
                arr[x++] = nums[j];
            for(int j = 0; j <= n-k-1; j++)
                arr[x++] = nums[j];
            for(int i = 0; i < n; i++)
            {
                nums[i] = arr[i];
            }
        }
    }
}
//nb=
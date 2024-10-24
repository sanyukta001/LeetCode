class Solution {
    void reverse(int[] nums,int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n>1)
        {
            if(n < k)
                k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        }
        //     int x = 0;
        //     int[] arr = new int [n];
        //     for(int j = n-k; j < n; j++)
        //         arr[x++] = nums[j];
        //     for(int j = 0; j <= n-k-1; j++)
        //         arr[x++] = nums[j];
        //     for(int i = 0; i < n; i++)
        //     {
        //         nums[i] = arr[i];
        //     }
        // }
        
        
    }
}
//nb=
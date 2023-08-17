class Solution {
    // public int left(int[]nums,int i)
    // {
    //     int s = 0;
    //     for(int j = 0; j <= i-1; i++)
    //         s += nums[j];
    //     return s;
    // }
    // public int right(int[]nums,int i)
    // {
    //     int s = 0;
    //     for(int j = i+1; j < nums.length; i++)
    //         s += nums[j];
    //     return s;
    //}
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] =0;
        right[nums.length-1] = 0;
        //right[0] = nums[0];
        for(int i = 1; i < nums.length;i++)
        {
                left[i] = left[i-1] + nums[i-1];
                right[nums.length-1-i] = right[nums.length-i] +nums[nums.length-i];
            //arr[i] = left(nums,i) - right(nums,i);
        }
        for(int i = 0; i < nums.length;i++)
        {
                
            arr[i] = Math.abs(left[i] - right[i]);
        }
        return arr;
    }
}
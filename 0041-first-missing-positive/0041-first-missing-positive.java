class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        for(int i = 1;;i++)
        {
            k = Arrays.binarySearch(nums,i);
            if(k<0 || k >=nums.length)
                return i;
            // if(nums[i] != k && k>0)
            //     return nums[i]-1;
            // k++;
        }
        //return k;
    }
}
//=nbNB
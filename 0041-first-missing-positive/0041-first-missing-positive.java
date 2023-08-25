class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        for(int i = 1;;i++)
        {
            k = Arrays.binarySearch(nums,i);
            if(k<0 || k >=nums.length)
                return i;
        }
    }
}
//=nbNB
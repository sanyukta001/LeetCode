class Solution {
    public int missingNumber(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length;i++)
            c += nums[i];
        int sum = n * (n+1)/2;
        return sum-c;
    }
}
//nb=
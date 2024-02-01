class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res = new int[nums.length/3][3];
        for(int i = 0; i < nums.length; i+=3){
            res[i/3][0] = nums[i];
            res[i/3][1] = nums[i+1];
            res[i/3][2] = nums[i+2];
            if(nums[i+2]-nums[i] > k)
                return new int[0][0];
        }
        return res;
    }
}
//nb=
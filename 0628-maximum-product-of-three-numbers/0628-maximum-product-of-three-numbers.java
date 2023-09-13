class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length;
        return Math.max((nums[0]*nums[1]*nums[x-1]),(nums[x-1]*nums[x-2]*nums[x-3]));
    }
}
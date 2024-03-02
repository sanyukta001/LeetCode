class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < nums.length;i++)
            pq.add(nums[i]*nums[i]);
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            res[i] = pq.peek();
            pq.poll();
        }
        return res;
    }
}
//nb=
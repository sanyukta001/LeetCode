class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = nums.length;
        int[] r = new int[l-k+1];
        int ri = 0;
        //store idex
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < nums.length; i++)
        {
            //remove elemets out of rage k
            if(!q.isEmpty() && q.peek() == i-k)
            {
                q.poll();
            }
            //remove smaller o. i k rage as they are useless
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i >= k-1)
            {
                r[ri++] = nums[q.peek()];
            }
        }
        return r;
    }
}
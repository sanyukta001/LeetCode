class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1; i < heights.length; i++)
        {
            int diff = heights[i] - heights[i-1];
            if(diff > 0)
            {
                if(pq.size() < ladders)
                {
                    pq.offer(diff);
                }
                else
                {
                    int r = diff;
                    if(pq.size() > 0 && pq.peek() < diff)
                    {
                        r = pq.remove();
                        pq.offer(diff);
                    }
                    if(bricks - r >= 0)
                        bricks-=r;
                    else
                        return i-1;
                }
            }
        }
        return heights.length-1;
    }
}
//nb=
class Solution {

    int[][] rects;
    int total = 0;
    Random r = new Random();
    List<Integer> list = new ArrayList<Integer>();
    public Solution(int[][] rects) {
        this.rects = rects;
        for(int[] rec:rects)
        {
            total += (rec[2]-rec[0]+1)*(rec[3]-rec[1]+1);
            list.add(total);
        }
        // list.add(total);
    }
    
    public int[] pick() {
        int select = (int)(Math.random()*(total));
        int lo = 0, hi = rects.length-1;
        // int mid = 0;
        while(lo<hi)
        {
            int mid = lo+(hi-lo)/2;
            if(select>=list.get(mid))
                lo = mid+1;
            else
                hi = mid;
        }
        int[] rec = rects[lo];
        int[] res = new int[2];
        int x = rec[0]+(int)(Math.random()*(rec[2]-rec[0]+1));
        int y = rec[1]+(int)(Math.random()*(rec[3]-rec[1]+1));
        res[0] = x;
        res[1] = y;
        return res;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */
//nb=
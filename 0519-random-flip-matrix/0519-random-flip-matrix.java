class Solution {

    Map<Integer,Integer> map;
    int row;
    int column;
    int countZeros;
    public Solution(int m, int n) {
        map = new HashMap<>();
        this.row = m;
        this.column = n;
        countZeros = m*n;
    }
    
    public int[] flip() {
        int r = (int)(Math.random()*countZeros);
        int actual;
        if(!map.containsKey(r))
            actual = r;
        else
            actual = map.get(r);
        int[] result = new int[]{actual/column,actual%column};
        int replace;
        if(!map.containsKey(countZeros-1))
            replace = countZeros-1;
        else
            replace = map.get(countZeros-1);
        map.put(r,replace);
        countZeros--;
        return result;
    }
    
    public void reset() {
        map.clear();
        countZeros = row*column;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
//nb=
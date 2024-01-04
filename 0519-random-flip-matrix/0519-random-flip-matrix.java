class Solution {

    Map<Integer,Integer> map;
    int row;
    int column;
    int countZeros;
    Random random;
    public Solution(int m, int n) {
        map = new HashMap<>();
        this.row = m;
        this.column = n;
        countZeros = m*n;
        random = new Random();
    }
    
    public int[] flip() {
        int r = random.nextInt(countZeros);
        int actual = map.getOrDefault(r,r);
        // if(!map.containsKey(random))
        //     actual = random;
        // else
        //     actual = map.get(random);
        int[] result = new int[]{actual/column,actual%column};
        map.put(r,map.getOrDefault(countZeros-1,countZeros-1));
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
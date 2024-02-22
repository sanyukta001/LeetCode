class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] map = new int[n+1];
        int[] map1 = new int[n+1];
        for(int i = 0; i < trust.length; i++)
        {
            map[trust[i][0]]++;
            map1[trust[i][1]]++;
        }
        for(int i = 1; i <= n; i++)
        {
            if(map[i] == 0 && map1[i] == n-1)
                return i;
        }
        return -1;
    }
}
//nb=
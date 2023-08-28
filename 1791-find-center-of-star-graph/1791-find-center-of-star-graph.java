class Solution {
    public int findCenter(int[][] edges) {
        int x = -1;
        for(int i = 1; i<edges.length;i++)
        {
            if(edges[i][0] == edges[i-1][0])
                x = edges[i][0];
            else if(edges[i][1] == edges[i-1][1])
                x = edges[i][1];
            else if(edges[i][0] == edges[i-1][1])
                x = edges[i][0];
            else if(edges[i][1] == edges[i-1][0])
                x = edges[i][1];
        }
        return x;
    }
}
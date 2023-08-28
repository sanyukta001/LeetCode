class Solution {
    public int findCenter(int[][] edges) {
        int x = -1;
        // for(int i = 1; i<edges.length;i++)
        // {
            if(edges[1][0] == edges[0][0])
                x = edges[1][0];
            else if(edges[1][1] == edges[0][1])
                x = edges[1][1];
            else if(edges[1][0] == edges[0][1])
                x = edges[1][0];
            else if(edges[1][1] == edges[0][0])
                x = edges[1][1];
        // }
        return x;
    }
}
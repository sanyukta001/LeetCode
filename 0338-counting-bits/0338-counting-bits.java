class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        int b = 0 , count = 0;
        ans[0] = 0;
        for(int i = 1; i <= n;i++)
        {
            int bin = binary(i);
            ans[i] = bin;
        }
        return ans;
    }
    public int binary(int n)
    {
        int x = 0;
        while(n>0)
        {
            if((n%2)==1)
                x++;
            n = n/2;
        }
        return x;
    }
}
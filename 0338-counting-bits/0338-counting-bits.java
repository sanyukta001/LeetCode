class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        int b = 0 , count = 0;
        ans[0] = 0;
        for(int i = 1; i <= n;i++)
        {
            int bin = binary(i);
            // while(bin>0)
            // {
            //     b = bin%10;
            //     if(b == 1)
            //         count++;
            //     bin = bin/10;
            // }
            // ans[i] = count;
                ans[i] = bin;
        }
        return ans;
    }
    public int binary(int n)
    {
        String s = "";
        // int b = 0;
                int x = 0;
        while(n>0)
        {
            // b = n%2;
            if((n%2)==1)
                x++;
            //s =s+(""+b);
            n = n/2;
        }
        //int l = Integer.parseInt(s);
        return x;
    }
}
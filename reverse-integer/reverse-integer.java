class Solution {
    public int reverse(int x) {
        int n = 0;
        int x1 = 0;
        if(x < 0)
            x1 = x*-1;
        else
            x1 = x;
        while(x1>0)
        {
            int d = x1 % 10;
            x1 = x1 / 10;
            if (n > Integer.MAX_VALUE/10 || (n == Integer.MAX_VALUE / 10 && d > 7))
                return 0;
            if (n < Integer.MIN_VALUE/10 || (n == Integer.MIN_VALUE / 10 && d < -8))
                return 0;
            n = n*10+d;
        }
        if(x < 0)
            n=n*-1;
        return n;
    }
}
//nb=
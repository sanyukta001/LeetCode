class Solution {
    int reverse(int cpy)
    {
        int r = 0;
        while(cpy>0)
        {
            int d = cpy%10;
            r = r*10+d;
            cpy=cpy/10;
        }
        return r;
    }
    public boolean isSameAfterReversals(int num) 
    {
        int cpy = num;
        int r1= reverse(cpy);
        int r2 = reverse(r1);
        if(num == r2)
            return true;
        else
            return false;
        
    }
}
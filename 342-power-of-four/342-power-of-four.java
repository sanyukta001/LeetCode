class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if(n == 1)
            return true;
        else if(n == 0)
            return false;
        int f = 1;
        while(n != 1)
        {
            if(n % 4 == 0)
                n = n / 4;
            else
            {
                f = 0;
                break;
            }
        }
        if(f == 0)
            return false;
        else
            return true;
        
    }
}
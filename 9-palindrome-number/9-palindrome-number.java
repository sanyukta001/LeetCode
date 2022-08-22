class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int num = x , rev = 0;
        if(x < 0)
            return false;
        while(x > 0)
        {
            int d = x%10;
            x=x/10;
            rev = rev*10+d;
        }
        if(rev == num)
            return true;
        else
            return false;
    }
}
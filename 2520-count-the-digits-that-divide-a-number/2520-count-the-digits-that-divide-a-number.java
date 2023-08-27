class Solution {
    public int countDigits(int num) {
        int x = num;
        int c = 0;
        while(x>0)
        {
            if(num % (x%10) == 0)
            {
                c++;
            }
            x = x / 10;
        }
        return c;
    }
}
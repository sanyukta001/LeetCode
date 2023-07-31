class Solution {
    public int commonFactors(int a, int b) {
        int min=0;
        int c = 0;
        if(a<b)
            min = a;
        else
            min = b;
        for(int i = 1; i <= min; i++)
        {
            if(a % i == 0 && b % i == 0)
                c++;
        }
        return c;
        
    }
}
class Solution {
    
    public int countPrimes(int n) 
    {
        boolean[] check = new boolean [n+1];
        Arrays.fill(check,true);
        int c = 0;
        if(n<2)
            return 0;
        for(int i = 2; i < n; i++)
        {
            if(check[i])
            {
                c++;
                if(((long)(i*i)) < n)
                {
                    for(int j = i+i; j < n; j+=i)
                        check[j] = false;
                }
            }
        }
        return c;
    }
}
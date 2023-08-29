class Solution {
    public int kthFactor(int n, int k) {
        int[] fact = new int[(n/2)+1];
        int f = 0;
        for(int i = 1; i <= n/2;i++)
        {
            if(n%i == 0)
                fact[f++] = i;
        }
        fact[f++] = n;
        if(k > f)
            return -1;
        else
            return fact[k-1];
    }
}
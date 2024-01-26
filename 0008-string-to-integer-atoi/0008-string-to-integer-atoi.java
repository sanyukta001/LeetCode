class Solution {
    int mod = 1000000007;
    public int myAtoi(String s) {
        s = s.trim();
        int x = 1;
        boolean isNegative = false;//=nbNB
        int start = 0;
        if(s.length()==0)
            return 0;
        if(s.length() > 0)
        {
            if(s.charAt(0) == '-')
            {   x = -1;
                start = 1;
                isNegative = true;
            }
            else if(s.charAt(0) == '+')
            {
                start = 1;
            }
        }
        long res = 0;
        for(int i = start; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(c >= 48 && c <= 57 )
            {
                res = res*10+(c - '0');
                if(x == -1 && -1*res<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                if(x == 1 && res > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
            else
                break;
        }
        return (int)(res*x);
    }
}
//nb=
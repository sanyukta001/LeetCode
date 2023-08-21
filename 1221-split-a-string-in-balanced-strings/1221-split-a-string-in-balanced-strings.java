class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int i = 0;
        int split = 0;
        while(i<s.length())
        {
        // while((r != l) || (r != 0))
        // {
            if(s.charAt(i) == 'R')
                r++;
            if(s.charAt(i) == 'L')
                l++;
            // i++;
            if(r!=l)
            {
                i++;
            }
            
        // }
        if(r==l)
        {
            split++;
            r = 0;
            l = 0;
            i++;
        }
        }
        return split;
    }
}
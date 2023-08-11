class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        //List<Integer> ss = new ArrayList<Integer>();
        if(s.length() == 0)
            return 0;
        int st = 0;
        int e = 0;
        int max = 1;
        while(e < s.length()-1)
        {
            char x = s.charAt(e+1);
            int f = 0;
            for(int i = st; i <= e; i++)
            {
                if(s.charAt(i) == x)
                {
                    f =1;
                    break;
                }
            }
            if(f == 0)
                e++;
            else
                st++;
            if(max<(e-st+1))
                max = e-st+1;
        }
        return max;
    }
}
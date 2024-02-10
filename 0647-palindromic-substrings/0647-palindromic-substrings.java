class Solution {
    public int countSubstrings(String s) {
        int count = s.length();
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i+1; j < s.length(); j++)
            {
                String x = s.substring(i,j+1);
                if(isPalin(x))
                    count++;
            }
        }
        return count;
    }
    boolean isPalin(String x)
    {
        int i = 0, j = x.length()-1;
        while(i < j)
        {
            if(x.charAt(i) != x.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
//nb=
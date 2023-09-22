class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = -1;
        int i = 0;
        while(i<s.length())
        {
            char x = s.charAt(i);
            i++;
            int f = 0;
            for(int j = k+1;j<t.length();j++)
            {
                if(t.charAt(j)==x)
                {
                    k = j;
                    f = 1;
                    break;
                }
            }
            if(f == 0)
                return false;
        }
        return true;
    }
}
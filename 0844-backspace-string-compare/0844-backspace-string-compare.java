class Solution {
    String word(String s)
    {
        String x = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '#' && x.equals(""))
                continue;
            else if(s.charAt(i)=='#')
                x = x.substring(0,x.length()-1);
            else
                x = x + s.charAt(i);
        }
        return x;
    }
    public boolean backspaceCompare(String s, String t) {
        return (word(s)).equals(word(t));
        
    }
}
//nb=
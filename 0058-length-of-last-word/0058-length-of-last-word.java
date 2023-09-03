class Solution {
    public int lengthOfLastWord(String s) {
        String w ="";
        s=s.trim();
        for(int i = s.length()-1;i>=0;i--)
        {
            char x = s.charAt(i);
            if(x != ' ')
                w = w+x;
            else
                return w.length();
        }
        return w.length();
    }
}
//=nbNB
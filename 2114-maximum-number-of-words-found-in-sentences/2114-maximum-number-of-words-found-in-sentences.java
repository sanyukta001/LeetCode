class Solution {
    int words(String s)
    {
        int c = 0;
        for(int i = 0; i < s.length();i++)
        {
            if(s.charAt(i)==' ')
                c++;
        }
        return c+1;
    }
    public int mostWordsFound(String[] sentences) {
        int c = words(sentences[0]);
        for(int i = 1; i < sentences.length;i++)
        {
            int x = words(sentences[i]);
            if(x>c)
                c = x;
        }
        return c;
        
    }
}
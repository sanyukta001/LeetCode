class Solution 
{
    public int firstUniqChar(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int x = map.get(s.charAt(i));
                map.put(s.charAt(i),x+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i<s.length();i++)
        {
            char x = s.charAt(i);
            if(map.get(x) == 1)
                return i;
        }
        return -1;
        
    }
}
//=nbNBnb=
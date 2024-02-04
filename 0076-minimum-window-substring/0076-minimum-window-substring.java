class Solution {
    Map<Character,Integer> smap = new HashMap<>();
    Map<Character,Integer> tmap = new HashMap<>();   
    public String minWindow(String s, String t) {
        if(t=="")
            return "";
        for(int i = 0; i < t.length(); i++)
        {
            if(!tmap.containsKey(t.charAt(i)))
                tmap.put(t.charAt(i),1);
            else
                tmap.put(t.charAt(i),tmap.get(t.charAt(i))+1);
        }
        int count = 0;
        int start = 0;
        int mlen = Integer.MAX_VALUE;
        int mleft = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(tmap.containsKey(x)){
                tmap.put(x,tmap.get(x)-1);
            if(tmap.get(x)>=0)
                count++;
            }
            while(count == t.length())
            {
                if(mlen > i-start+1)
                {
                    mlen = i-start+1;
                    mleft = start;
                }
                if(tmap.containsKey(s.charAt(start)))
                {
                    tmap.put(s.charAt(start),tmap.get(s.charAt(start))+1);
                    if(tmap.get(s.charAt(start))>0)
                        count--;
                }
                start++;
            }
         }
        if(mlen > s.length())
            return "";
        return s.substring(mleft,mleft+mlen);
    }
}
//nb=
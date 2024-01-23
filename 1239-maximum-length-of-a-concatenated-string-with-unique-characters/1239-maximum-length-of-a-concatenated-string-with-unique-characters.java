class Solution {
    public int maxLength(List<String> arr) {
        List<String> list = new ArrayList<>();
        list.add("");
        int res = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            int s = list.size();
            for(int j = 0; j < s; j++)
            {
                if(same(arr.get(i),list.get(j))==false)
                {
                    String nw = arr.get(i)+list.get(j);
                    res = Math.max(res,nw.length());
                    list.add(nw);
                }
                    
            }
        }
        return res;
        
    }
    boolean same(String x , String y)
    {
        String z = x+y;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < z.length(); i++)
        {
            if(!map.containsKey(z.charAt(i)))
                map.put(z.charAt(i),1);
            else
                return true;
        }
        return false;
    }
}
//nb=
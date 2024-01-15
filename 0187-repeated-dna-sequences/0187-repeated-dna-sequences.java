class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        if(s.length() <= 10)
            return list;
        // Map<String,Integer> map = new HashMap<>();
        // for(int i = 0; i < s.length(); i++)
        // {
        //     Map<String,Integer> map = new HashMap<>();
        //     int j = i;
        //     while(j+10 <= s.length())
        //     {
        //         String x = s.substring(j,j+10);
        //         if(!map.containsKey(x))
        //             map.put(x,1);
        //         else
        //         {
        //             if(map.get(x) == 1)
        //             {
        //                 list.add(x);
        //             }
        //             map.put(x, map.get(x)+1);
        //         }
        //         if(j==0)
        //             j = j + 10;
        //         else
        //             j++;
        //     }
        // }
        // return list;
        Map<String,Integer> seen = new HashMap<>();
        Map<String,Integer> res = new HashMap<>();
        for(int i = 0; i < s.length()-9; i++)
        {
            String curr = s.substring(i,i+10);
            if(seen.containsKey(curr))
                res.put(curr,1);
            seen.put(curr,1);
        }
        for(Map.Entry<String,Integer> entry:res.entrySet())
        {
            list.add(entry.getKey());
        }
        return list;
    }
}
//nb=
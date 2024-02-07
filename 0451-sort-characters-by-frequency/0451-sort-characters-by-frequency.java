class Solution {
//     public static <K, V extends Comparable<V> > Map<K, V> 
//     valueSort(final Map<K, V> map) 
//     { 
//         Comparator<K> valueComparator = new Comparator<K>() { 
//                   public int compare(K k1, K k2) 
//                   { 
//                       int comp = map.get(k1).compareTo( 
//                           map.get(k2)); 
//                       if (comp == 0) 
//                           return 1; 
//                       else
//                           return comp; 
//                   } 
            
//               }; 
//         Map<K, V> sorted = new TreeMap<K, V>(valueComparator); 
        
//         sorted.putAll(map); 
        
//         return sorted; 
//     } 
    public String frequencySort(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        // String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(!map.containsKey(x))
                map.put(x,1);
            else
                map.put(x,map.get(x)+1);
        }
        String[] res = new String[s.length()+1];
        Arrays.fill(res,"");
        for(Map.Entry<Character,Integer> mp:map.entrySet())
        {
            int y = mp.getValue();
            char x = mp.getKey();
            res[y] += x; 
        }
        String fa = "";
        for(int i = 1; i < s.length()+1; i++)
        {
            if(res[i] != "")
            {
                for(int j = 0; j < res[i].length(); j++)
                {
                    String temp = "";
                    for(int k = 1; k <= i; k++)
                    {
                        temp += res[i].charAt(j); 
                    }
                    fa = temp + fa;
                }
            }
        }
        return fa;
        // Map sortedMap = valueSort(map);
        // Set set = sortedMap.entrySet(); 
        // Iterator i = set.iterator(); 
        // while (i.hasNext())
        // {
        //     Map.Entry mp = (Map.Entry)i.next();
        //     String temp = "";
        //     for(int y = 1; y <= (int) mp.getValue(); y++)
        //     {
        //         temp = temp + mp.getKey();
        //     }
        //     res =  temp+res;
        // }
        // return res;
    }
}
//nb=
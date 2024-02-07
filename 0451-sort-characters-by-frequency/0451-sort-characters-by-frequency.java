class Solution {
    public static <K, V extends Comparable<V> > Map<K, V> 
    valueSort(final Map<K, V> map) 
    { 
        // Static Method with return type Map and 
        // extending comparator class which compares values 
        // associated with two keys 
        Comparator<K> valueComparator = new Comparator<K>() { 
            
                  // return comparison results of values of 
                  // two keys 
                  public int compare(K k1, K k2) 
                  { 
                      int comp = map.get(k1).compareTo( 
                          map.get(k2)); 
                      if (comp == 0) 
                          return 1; 
                      else
                          return comp; 
                  } 
            
              }; 
        
        // SortedMap created using the comparator 
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator); 
        
        sorted.putAll(map); 
        
        return sorted; 
    } 
    public String frequencySort(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(!map.containsKey(x))
                map.put(x,1);
            else
                map.put(x,map.get(x)+1);
        }
        Map sortedMap = valueSort(map);
        Set set = sortedMap.entrySet(); 
        Iterator i = set.iterator(); 
        while (i.hasNext())
        {
            Map.Entry mp = (Map.Entry)i.next();
            // char x = mp.getKey(); 
            // int y = mp.getValue();
            String temp = "";
            for(int y = 1; y <= (int) mp.getValue(); y++)
            {
                temp = temp + mp.getKey();
            }
            res =  temp+res;
        }
        return res;
    }
}
//nb=
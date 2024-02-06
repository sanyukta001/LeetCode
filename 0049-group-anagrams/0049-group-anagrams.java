class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        String[] copy = new String[strs.length];
        for(int i = 0; i < strs.length; i++)
        {
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            copy[i] = new String(tempArray);
        }
        Map<String,List<Integer>> map = new HashMap<>();
        for(int i = 0; i < copy.length; i++)
        {
            if(map.containsKey(copy[i]))
            {
                List<Integer> x = new ArrayList(map.get(copy[i]));
                x.add(i);
                map.put(copy[i],x);
            }
            else
            {
                List<Integer> temp = new ArrayList();
                temp.add(i);
                map.put(copy[i],temp);
            }
        }
        for(Map.Entry<String,List<Integer>> entry: map.entrySet())
        {
            List<Integer> t = new ArrayList(entry.getValue());
            List<String> ires = new ArrayList();
            for(int i = 0; i < t.size();i++)
            {
                ires.add(strs[t.get(i)]);
            }
            res.add(ires);
        }
        return res;
    }
}
//nb=
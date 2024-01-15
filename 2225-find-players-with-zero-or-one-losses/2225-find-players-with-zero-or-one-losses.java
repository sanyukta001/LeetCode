class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < matches.length; i++)
        {
            map.put(matches[i][0],0);
        }
        for(int i = 0; i< matches.length; i++)
        {
            if(map.containsKey(matches[i][1]))
                map.put(matches[i][1],map.get(matches[i][1])+1);
            else
                map.put(matches[i][1],1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==0)
                first.add(entry.getKey());
            if(entry.getValue()==1)
                second.add(entry.getKey());
        }
        result.add(first);
        result.add(second);
        return result;
        
    }
}
//nb=
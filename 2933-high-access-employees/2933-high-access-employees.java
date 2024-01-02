class Solution {
    boolean isHighAccess(List<Integer> times)
    {
        if(times.size() >= 3)
        { 
            for(int i = 0; i < times.size(); i++)
            {
                int a = times.get(i);
                if((i+2) < times.size())
                if(times.get(i+2) <= (a+99))
                    return true;
            }
        }
        return false;
    }
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans = new ArrayList<>();
        Map <String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < access_times.size(); i++)
        {
            String x = access_times.get(i).get(0);
            String y = access_times.get(i).get(1);
            
            if(!map.containsKey(x))
                map.put(x,new ArrayList<>());
            int t = Integer.parseInt(y);
            map.get(x).add(t);
        }
        for(Map.Entry<String,List<Integer>> entry: map.entrySet())
        {
            List<Integer> times = entry.getValue();
            Collections.sort(times);
            if(isHighAccess(times))
            {
                ans.add(entry.getKey());
            }
            
        }
        return ans;
    }
}
//nb=
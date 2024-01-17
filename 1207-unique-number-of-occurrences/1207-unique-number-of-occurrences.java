class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        HashSet<Integer> check = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int x = entry.getValue();
            if(check.contains(x))
                return false;
            check.add(x);
        }
        return true;
    }
}
//nb=
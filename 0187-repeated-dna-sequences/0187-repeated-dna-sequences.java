class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        if(s.length() <= 10)
            return list;
        HashSet<String> seen = new HashSet<>();
        HashSet<String> res = new HashSet<>();
        for(int i = 0; i < s.length()-9; i++)
        {
            String curr = s.substring(i,i+10);
            if(seen.contains(curr))
                res.add(curr);
            seen.add(curr);
        }
        for(String entry:res)
        {
            list.add(entry);
        }
        return list;
    }
}
//nb=
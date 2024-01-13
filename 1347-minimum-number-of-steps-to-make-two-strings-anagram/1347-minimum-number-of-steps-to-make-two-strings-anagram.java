class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        int res = 0;
        for(int i = 0; i < 26; i++)
        {
            if(count[i]>0)
                res += count[i];
        }
        return res;
    }
}
//nb=
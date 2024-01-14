class Solution {
    public boolean closeStrings(String word1, String word2) {
     if(word1.length() != word2.length())
         return false;
     int[] wCount1 = new int[26];
     int[] wCount2 = new int[26];
        for(int i = 0; i < word1.length(); i++)
            wCount1[word1.charAt(i)-'a']++;
        for(int i = 0; i < word2.length(); i++)
            wCount2[word2.charAt(i) - 'a']++;
        for(int i = 0; i < 26; i++)
        {
            if((wCount1[i] == 0 && wCount2[i] != 0) || (wCount1[i] != 0 && wCount2[i] == 0))
                return false;
        }
        Arrays.sort(wCount1);
        Arrays.sort(wCount2);
        return Arrays.equals(wCount1,wCount2);
    }
}
//nb=
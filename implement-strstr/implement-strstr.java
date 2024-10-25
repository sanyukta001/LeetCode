class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while(i < haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+needle.length() <= haystack.length() && haystack.substring(i,i+needle.length()).equals(needle))
                    return i;
            }
            i++;
        }
        return -1;
    }
}
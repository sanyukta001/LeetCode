class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ars = s.toCharArray();
        char[] art = t.toCharArray();
        Arrays.sort(ars);
        Arrays.sort(art);
        String s1 = new String(ars);
        String t1 = new String(art);
        return s1.equals(t1);
    }
}
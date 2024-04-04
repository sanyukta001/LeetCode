class Solution {
    public boolean rotateString(String s, String goal) {
        int shift = 0;
        while(shift!=s.length())
        {
            if(s.equals(goal))
                return true;
            else
            {
                shift++;
                s = s.substring(1) + s.charAt(0);
            }
        }
        return false;
    }
}
//nb=
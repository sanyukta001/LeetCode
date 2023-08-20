class Solution {
    public String finalString(String s) {
        StringBuilder w = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            if(x != 'i')
                w.append(x);
            else{
                w.reverse();
            }
        }
        return w.toString();
    }
}
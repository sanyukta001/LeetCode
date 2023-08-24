class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        title = title+" ";
        String s = "";
        // StringBuilder w = new StringBuilder();
        String w = "";
        for(int i = 0; i < title.length();i++)
        {
            char x = title.charAt(i);
            if(x != ' ')
                w = w+x;
            else{
                if(w.length()<=2)
                    s = s+w+" ";
                else
                {
                    w = Character.toUpperCase(w.charAt(0)) + w.substring(1)+" ";
                    s = s+w;
                }
                w = "";
            }
        }
        return s.substring(0,s.length()-1);
    }
}
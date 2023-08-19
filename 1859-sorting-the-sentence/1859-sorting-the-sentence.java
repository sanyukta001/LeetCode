class Solution {
    public String sortSentence(String s) {
        String[] arr = new String [10];
        int c = 0;
        s=s+" ";
        int p = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                int x=(s.charAt(i-1)-'0');
                arr[x] = s.substring(p,i-1);
                p = i+1;
                c++;
            }
        }
        // String w = "";
        StringBuilder w = new StringBuilder();
        for(int i=1;i<=c;i++)
        {
            if(i==c)
            {
                // w = w + arr[i];
                w.append(arr[i]);
            }
            else
            {
                // w = w + arr[i]+" ";
                w.append(arr[i]).append(" ");
            }
        }
        return w.toString();
    }
}
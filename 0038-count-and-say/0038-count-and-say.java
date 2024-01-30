class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String x = countAndSay(n-1);
        // HashMap<String,Integer> map = new HashMap<>();
        // for(int i = 0; i < x.length(); i++)
        // {
        //     if(!map.containsKey(x.charAt(i)+""))
        //         map.put(x.charAt(i)+"",1);
        //     else
        //         map.put(x.charAt(i)+"",map.get(x.charAt(i)+"")+1);
        // }
        String res = "";
        // for(Map.Entry<String,Integer> entry:map.entrySet())
        int i = 0;
        while(i < x.length())
        {
            // while(i!=0 && i < x.length() && x.charAt(i)==x.charAt(i-1))
            //     i++;
            int c = 1;
            while(i < x.length()-1 && x.charAt(i)==x.charAt(i+1)){
                i++;
                c++;
            }
            if(i>=x.length())
                break;
            res += c+""+x.charAt(i);
            i++;
        }
        return res;
        
    }
}
//nb=
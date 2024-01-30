class Solution {
    String[] dp = new String[31]; 
    public String countAndSay(int n) {
        if(n==1)
        {
            dp[1] = "1";
            return dp[n];
        }
        if(dp[n] != null)
            return dp[n];
        // String x = countAndSay(n-1);
        String x;
        if(dp[n-1]!=null)
            x = dp[n-1];
        x = countAndSay(n-1);
        String res = "";
        int i = 0;
        while(i < x.length())
        {
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
        dp[n] = res;
        return dp[n];
        
    }
}
//nb=
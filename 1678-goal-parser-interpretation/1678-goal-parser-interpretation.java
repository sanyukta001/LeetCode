class Solution {
    public String interpret(String command) {
        String x="";
        for(int i = 0; i < command.length();i++)
        {
            char n= command.charAt(i);
            if(n=='G')
                x=x+"G";
            else if(n=='(' && command.charAt(i+1)==')')
                x=x+"o";
            else if(n=='(' && command.charAt(i+1)!=')')
                x=x+"al";
        }
        return x;
        
    }
}
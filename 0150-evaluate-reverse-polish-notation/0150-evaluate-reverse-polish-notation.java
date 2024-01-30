class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0;  i < tokens.length; i++)
        {
            char ch = tokens[i].charAt(0);
            if((ch=='+' || ch=='-' || ch=='*' || ch=='/') && (tokens[i].length() == 1))
            {
                int x = st.pop();
                int y = st.pop();
                if(ch == '+')
                    st.push(y+x);
                else if(ch == '-')
                    st.push(y-x);
                else if(ch == '*')
                    st.push(y*x);
                else if( ch == '/')
                    st.push(y/x);
            }
            else
            {
                int j=0;
                int sign = 1;
                if(tokens[i].charAt(0)=='-')
                {
                    j = 1;
                    sign = -1;
                }
                int num = 0;
                while(j<tokens[i].length())
                {
                    char x = tokens[i].charAt(j);
                    num = num*10+(x-'0');
                    j++;
                }
                st.push(num*sign);
            }
        }
        return st.peek();
    }
}
//nb=
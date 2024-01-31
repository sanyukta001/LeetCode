class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int[] res = new int[temperatures.length];
        // for(int i = 0; i < temperatures.length; i++)
        // {
        //     for(int j = i+1; j < temperatures.length; j++)
        //     {
        //         if(temperatures[j] > temperatures[i])
        //         {
        //             res[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        // return res;
        
        Stack<Integer> st = new Stack<Integer>();
        int[] res = new int[temperatures.length];
        // res[temperatures.length-1] = 0;
        
        for(int i = temperatures.length-1;i>=0; i--)
        {
            // if(st.empty())
            // {
            //     res[i] = 0;
            //     st.push(i);
            // }
            // else if(temperatures[i] > temperatures[st.peek()])
            // {
                while(st.empty()==false && temperatures[i] >= temperatures[st.peek()])
                    st.pop();
                if(st.empty())
                {
                    res[i] = 0;
                    st.push(i);
                }
            // }
            if(temperatures[i] < temperatures[st.peek()])
            {
                res[i] = st.peek()-i;
                st.push(i);
            }
            // if(temperatures[i] == temperatures[st.peek()])
            // {
            //     st.pop
            // }
        }
        return res;
    }
}
//nb=
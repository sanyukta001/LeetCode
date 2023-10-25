class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }

        if (k % 2 == 0) {
            return kthGrammar(n - 1, k / 2) == 0 ? 1 : 0;
        } else {
            return kthGrammar(n - 1, (k + 1) / 2) == 0 ? 0 : 1;
        }
        // String prev = "0";
        // String curr = "";
        // int c = 1;
        // if(n == 1)
        //     return 0;
        // else
        // {
        //     while(c != n)
        //     {
        //         for(int i = 0;i<prev.length();i++)
        //         {
        //             if(prev.charAt(i)=='0')
        //                 curr = curr + "01";
        //             else
        //                 curr = curr + "10";
        //         }
        //         prev = curr;
        //         curr = "";
        //         c++;
        //     }
        // }
        // return (prev.charAt(k-1)-'0');
    }
}
//=nb
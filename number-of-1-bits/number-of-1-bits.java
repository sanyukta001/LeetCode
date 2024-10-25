public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        // String s = n +  "";
        // int i = 0;
        // while(i != 0)
        // // while(n>0)
        // // {
        // //     if(n%10 == 1)
        // //         c++;
        // //     n = n / 10;
        // // }
        while(n > 0){
            if((n&1) == 1)c++;
            n=n>>1;
        }
        return c;
    }
}
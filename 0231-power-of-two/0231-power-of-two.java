class Solution {
    public boolean isPowerOfTwo(int n) {
        // static int x = 1;
        if(n <= 0)
            return false;
        if(n <= 2)
            return true;
        if(n%2!=0)
            return false;
        // if(n == (int)Math.pow(2,x))
        // {
        //     return true;
        // }
        // if(n > (int)Math.pow(2,x))
        //     return false;
        else{
            // x++;
            return isPowerOfTwo(n/2);
        }
    }
}
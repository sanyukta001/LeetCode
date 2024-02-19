class Solution {
    public boolean isPowerOfTwo(int n) {
        // static int x = 1;
        if(n <= 0)
            return false;
        if(n <= 2)
            return true;
        if(n%2!=0)
            return false;
        else{
            return isPowerOfTwo(n/2);
        }
    }
}
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;
        if(1162261467%n==0)
            return true;
        return false;
    }
}
//nb=
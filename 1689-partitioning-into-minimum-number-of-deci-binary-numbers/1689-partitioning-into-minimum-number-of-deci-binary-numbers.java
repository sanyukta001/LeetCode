class Solution {
    public int minPartitions(String n) {
        int k = 0;
        for(int i = 0; i < n.length(); i++)
        {
            int x = n.charAt(i)-'0';
            k = (k>x)?k:x;
        }
        return k;
    }
}
//nb=
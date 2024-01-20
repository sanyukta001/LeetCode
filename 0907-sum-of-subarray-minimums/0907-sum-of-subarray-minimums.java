class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mi = Integer.MAX_VALUE;
        long sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int j = i;
            int k = i;
            // mi = arr[i];
            int g2 = 1, g1 = 1;
            while(j+1 < arr.length && arr[j+1]>arr[i])
            {
                g2++;
                j++;
            }
            while(k-1 >= 0 && arr[k-1]>=arr[i])
            {
                g1++;
                k--;
            }
            long prod = (g1*g2)%1000000007;
            prod = (prod*arr[i])%1000000007;
            sum = (sum%1000000007+prod)%1000000007;
            // while(j<arr.length)
            // {
            //     if(arr[j]<mi)
            //     {
            //         mi = arr[j];
            //         // sum = sum + mi;
            //     }
            //     // else
            //         sum += mi;
            //     j++;
            // }
        }
        return (int)sum;
    }
}
//nb=
class Solution {
    int[] dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return calculate(arr, 0, arr.length,k);
    }
    int calculate(int[] arr, int i , int n, int k){
        if(i == n)
            return 0;
        if(dp[i] != -1)
            return dp[i];
        int l = 0;
        int maxi = Integer.MIN_VALUE;
        int fsum = 0, sum = 0;
        for(int j = i; j < Math.min(n,i+k); j++)
        {
            l++;
            maxi = Math.max(maxi,arr[j]);
            sum = (l*maxi) + calculate(arr,j+1,n,k);
            fsum = Math.max(fsum,sum);
        }
        dp[i] = fsum;
        return fsum;
    }
}
//nb=
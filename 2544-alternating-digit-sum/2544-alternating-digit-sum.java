class Solution {
    public int alternateDigitSum(int n) {
        int k = 0;
        int l = (n+"").length();
        int[] arr = new int[l];
        int j  = 0;
        while(n > 0)
        {
            arr[j++] = n%10;
            n= n/10;
        }
        int sum = 0;
        for(int i = l-1;i>=0;i--)
        {
            int mul = (int)Math.pow(-1,k);
            k++;
            sum = sum + mul*arr[i];
        }
        return sum;
    }
}
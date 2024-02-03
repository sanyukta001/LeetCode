class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        int maxProd = Integer.MIN_VALUE;
        int prod = 1;
        for(int i = 0; i < l; i++)
        {
            prod = nums[i];
            maxProd = Math.max(maxProd,prod);
            for(int j = i+1; j < l; j++)
            {
                prod *= nums[j];
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }
}
//nb=
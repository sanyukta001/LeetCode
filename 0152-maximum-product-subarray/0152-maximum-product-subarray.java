class Solution {
    public int maxProduct(int[] nums) {
        // int l = nums.length;
        // int maxProd = Integer.MIN_VALUE;
        // int prod = 1;
        // for(int i = 0; i < l; i++)
        // {
        //     prod = nums[i];
        //     maxProd = Math.max(maxProd,prod);
        //     for(int j = i+1; j < l; j++)
        //     {
        //         prod *= nums[j];
        //         maxProd = Math.max(maxProd, prod);
        //     }
        // }
        // return maxProd;
        
        int l = nums.length;
        // int i = 0;
        int prefix = 1;
        int suffix = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i = 0; i < l; i++)
        {
            if(prefix == 0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;
            prefix *= nums[i];
            suffix *= nums[l-i-1];
            maxProd = Math.max(maxProd,Math.max(prefix,suffix));
        }
        return maxProd;
    }
}
//nb=
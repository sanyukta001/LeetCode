class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length;
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
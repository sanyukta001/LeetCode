class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] res = new int[n];
        int k = 0;
        int i = 0;
        while(i < n)
        {
            int x = nums[i];
            while(nums[i] == x)
            {
                res[k]++;
                i++;
                if(res[k] > (n/2))
                    return x;
            }
            k++;
        }
        return -1;
    }
}
//nb=
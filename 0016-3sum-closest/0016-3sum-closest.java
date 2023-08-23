class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int[] res = new int[nums.length-2];
        Arrays.sort(nums);
        // int i = 0;
        // int j = 0;
        // int sum = 0;
        int res = 0;
        int m = Integer.MAX_VALUE;
        for(int k = 0;k < nums.length;k++)
        {
            int first = nums[k];
            int i = k+1;
            int j = nums.length-1;
            
        while(i<j)
        {
            int sum =first+nums[i]+nums[j];
            // res[k++] = sum;
            if(sum == target)
                return target;
            else if(Math.abs(target-sum) < m)
            {
                m = Math.abs(target-sum);
                res = sum;
            }
            if(sum>target)
                j--;
            else
                i++;
        }
     }
        return res;
    }
}
//=nbNB
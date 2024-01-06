class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        int count = 0;
        Set<List<Integer>> subarrays = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            count = 0;
            List<Integer> temp = new ArrayList<>();
            for(int j = i; j < n; j++)
            {
                temp.add(nums[j]);
                if(nums[j]%p == 0)
                    count++;
                if(count <= k)
                    subarrays.add(new ArrayList<>(temp));
            }
        }
        return subarrays.size();
        
    }
}
//nb=
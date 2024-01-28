class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        HashSet<List<Integer>> set = new HashSet();
        for(int i = 0; i < nums.length; i++)
        {
            HashSet<Integer> check = new HashSet();
            for(int j = i+1; j < nums.length; j++)
            {
                List<Integer> temp = new ArrayList();
                if(check.contains(0-(nums[i]+nums[j])))
                {
                    // temp = [nums[i],nums[j],(0-(nums[i]+nums[j]))];
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(0-(nums[i]+nums[j]));
                    Collections.sort(temp);
                    set.add(temp);
                }
                check.add(nums[j]);
                
            }
        }
        return new ArrayList(set);
    }
}
//nb=
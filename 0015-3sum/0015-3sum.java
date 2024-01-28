class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList();
//         HashSet<List<Integer>> set = new HashSet();
//         for(int i = 0; i < nums.length; i++)
//         {
//             HashSet<Integer> check = new HashSet();
//             for(int j = i+1; j < nums.length; j++)
//             {
//                 List<Integer> temp = new ArrayList();
//                 if(check.contains(0-(nums[i]+nums[j])))
//                 {
//                     // temp = [nums[i],nums[j],(0-(nums[i]+nums[j]))];
//                     temp.add(nums[i]);
//                     temp.add(nums[j]);
//                     temp.add(0-(nums[i]+nums[j]));
//                     Collections.sort(temp);
//                     set.add(temp);
//                 }
//                 check.add(nums[j]);
                
//             }
//         }
//         return new ArrayList(set);
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++)
        {
            if(i!=0 && nums[i] == nums[i-1])
                continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k)
            {
                while(j!=i+1 && j<nums.length && nums[j] == nums[j-1])
                    j++;
                while(k!=nums.length-1 && k>=0 && nums[k] == nums[k+1])
                    k--;
                if(j>=k)
                    break;
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else
                    k--;
            }
        }
        return res;
    }
}
//nb=
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // List<List<Integer> > arr = new ArrayList<List<Integer> >();
        // int i = 0, j = 1;
        // int k = nums.length-1; 
        // int l;
        // if(nums.length < 4)
        //     return arr;
        // //Arrays.sort(nums);
        // Stack<Integer> stack = new Stack<Integer>();
        // l = j+1;
        // //stack.push(l);
        // while(l < k)
        // {
        //     stack.push(l);
        //     if(nums[stack.peek()] == nums[i]+nums[j]+nums[k])
        //     {
        //         List<Integer> res = new ArrayList<Integer>();
        //         res.add(nums[i]);
        //         res.add(nums[j]);
        //         res.add(nums[l]);
        //         res.add(nums[k]);
        //         arr.add(res);
        //     }
        //     l++;
        // }
        // return arr;
        List<List<Integer>> res = new ArrayList();
        HashSet<List<Integer>> set = new HashSet();
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                HashSet<Long> check = new HashSet();
                for(int k = j+1; k < nums.length; k++)
                {
                    // HashSet<Integer> check = new HashSet();
                    long sum = nums[i]+nums[j];
                    sum+=nums[k];
                    long fourth = target- sum;
                    if(check.contains(fourth))
                    {
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                        check.add((long)nums[k]);
                }
            }
        }
        return new ArrayList(set);
    }
}
//=nb=
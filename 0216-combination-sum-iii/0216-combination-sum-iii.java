class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        list.add(new ArrayList());
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int tempAdd = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int size = list.size();
            for(int j = 0; j < size; j++)
            {
                List<Integer> temp = new ArrayList(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
                tempAdd = 0;
                for(int l = 0;l<temp.size();l++)
                {
                    tempAdd += temp.get(l);
                }
                if(tempAdd == n && temp.size() == k)
                    ans.add(temp);
            }
        }
        return ans;
    }
}
//nb=
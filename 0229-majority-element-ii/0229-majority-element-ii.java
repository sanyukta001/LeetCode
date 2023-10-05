class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        ArrayList <Integer>res = new ArrayList<Integer>(); 
        for(int i = 0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
                m.put(nums[i],m.get(nums[i])+1);
            else
                m.put(nums[i],1);
            if(m.get(nums[i]) == (nums.length/3)+1)
                res.add(nums[i]);
        }
        return res;
    }
}
//nb=
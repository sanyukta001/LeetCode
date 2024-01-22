class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int k1 = 0, k2 = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        for(int i = 1; i <= nums.length; i++)
        {
            if(!map.containsKey(i))
                k2 = i;
            else if(map.get(i)!=1)
                k1 = i;
            if(k1 != 0 && k2 != 0)
                break;
        }
        res[0] = k1;
        res[1] = k2;
        return res;
    }
}
//nb=
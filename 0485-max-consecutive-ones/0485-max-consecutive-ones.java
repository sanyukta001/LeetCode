class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m = 0;
        for(int i = 0;i<nums.length;)
        {
            int c = 0;
            while(i<nums.length && nums[i]==1)
            {
                c++;
                i++;
            }
            if(m<c)
                m=c;
            if(i<nums.length && nums[i]!=1)
            {
                i++;
                //continue;
            }
        }
        return m;
    }
}
//nb=
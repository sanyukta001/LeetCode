class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int u = nums.length-1;
        int[] ar = new int[2];
        while(l<=u)
        {
            int mid = (u+l)/2;
            if(nums[mid] == target)
            {
                int first = mid;
                if(first == 0)
                    ar[0] = 0;
                else if(target == nums[0])
                    ar[0] = 0;
                else if(nums[first-1] == target)
                {
                    while(nums[first] == target && first != 0)
                    {
                        first--;
                    }
                    ar[0] = first+1;
                }
                else
                    ar[0] = first;
                
                if(mid == nums.length-1)
                    ar[1] = mid;
                else if(target == nums[nums.length-1])
                    ar[1]= nums.length-1;
                else if(nums[mid+1] == target)
                {
                    while(nums[mid] == target && mid != nums.length-1)
                    {
                        mid++;
                    }
                    ar[1]=mid-1;
                }
                else
                    ar[1]= mid;
                return ar;
            }
            else if(nums[mid]>target)
            {
                u = mid-1;
            }
            else 
                l = mid+1;
        }
        ar[0] = -1;
        ar[1] = -1;
        return ar;
    }
}
//nb=
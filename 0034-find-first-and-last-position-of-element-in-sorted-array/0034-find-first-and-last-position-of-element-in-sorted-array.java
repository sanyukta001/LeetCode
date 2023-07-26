class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        // int a[]=new int [2];
        // int n = nums.length;
        //  a[0]=-1;
        //  a[1]=-1;
        // for(int i=0,j=n-1;i<=j;)
        // {
        //     if(nums[i] == target)
        //     {
        //         a[0] = i;
        //     }
        //     else
        //         i++;
        //     if(nums[j] == target)
        //     {
        //         a[1] = j;
        //     }
        //     else
        //         j--;
        //     if(a[0]!=-1&&a[1]!=-1)
        //         break;
        // }
        // return a;
        
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end; 
        return ans;
    }
    int search(int nums[],int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(target<nums[middle])
                end=middle-1;
            else if(target>nums[middle])
                start=middle+1;
            else
            {
                ans=middle;
                if(findstartindex == true){
                    end=middle-1;
                }
                else{
                    start=middle+1;
                }
            }
       }
        return ans;
    }
    }
   
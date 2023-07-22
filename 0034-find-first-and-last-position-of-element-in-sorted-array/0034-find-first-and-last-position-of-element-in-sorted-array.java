class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int a[]=new int [2];
        int n = nums.length;
//         int first = 0, last = n-1;
//         int ans = -1;
//         int mid = first + (last - first)/2;
//         while(first < last)
//         {
//             if(nums[mid] == target)
//             {
//                 ans = mid;
//                 break;
//             }
//             else if(nums[mid] > target)
//             {
//                 last = mid - 1;
//             }
//             else
//             {
//                 last = mid + 1;
//             }
//             mid = first + (last - first)/2;
//         }
//         if(ans==-1)
//         {
//             a[0]=-1;
//             a[1]=-1;
//             return a; 
//         }
//         int start = mid;
//         int end = mid;
//         while(nums[start]==target)
//         {
//             start--;
//             if(start==-1)
//                 break;
//         }
//         start+=1;
//         while(nums[end]==target)
//         {
//             end++;
//             if(end == n)
//                 break;
//         }
//         end-=1;
//         a[0]=start;
//         a[1]=end;
//         return a;
         a[0]=-1;
         a[1]=-1;
        for(int i=0,j=n-1;i<=j;)
        {
            if(nums[i] == target)
            {
                a[0] = i;
            }
            else
                i++;
            if(nums[j] == target)
            {
                a[1] = j;
            }
            else
                j--;
            if(a[0]!=-1&&a[1]!=-1)
                break;
        }
        return a;
    }
   
}
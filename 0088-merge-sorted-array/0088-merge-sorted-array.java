class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int nums3[] = new int[m+n]; 
        // int k = 0;
        // int i = 0;
        // int j = 0;
        // while(i<m && j<n)
        // {
        //     if(nums1[i] <= nums2[j])
        //         nums3[k++] = nums1[i++];
        //     else
        //         nums3[k++] = nums2[j++];
        // }
        // while(i<m)
        // {
        //     nums3[k++] = nums1[i++];
        // }
        // while(j<n)
        // {
        //     nums3[k++] = nums2[j++];
        // }
        // for(int x = 0; x < k; x++)
        // {
        //     nums1[x] = nums3[x];
        // }
        
        int i = 0, j = 0;
        while(i<m+n&&j < n)
        {
            // if(nums1[i] == 0)
            //     break;
            if(nums1[i] < nums2[j])
                i++;
            else
            {
                for(int k = m+n-1; k > i; k--)
                    nums1[k] = nums1[k-1];
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
        int x = n-1;
        int y = nums1.length-1;
        while(j<n)
        {
            nums1[y]=nums2[x];
            j++;
            y--;
            x--;
        }
    
    }
}
//nb=
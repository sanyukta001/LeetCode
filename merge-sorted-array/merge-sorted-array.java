class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while(i<m+n&&j < n)
        {
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
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = nums1.length+nums2.length;
        int x = l/2+1;
        double prev = 0;
        while(x-- > 0)
        {
            prev = k;
            if(i>nums1.length-1)
            {
                k = nums2[j];
                j++;
            }
            else if(j>nums2.length-1)
            {
                k = nums1[i];
                i++;
            }
            else if(nums1[i]<nums2[j])
            {
                k = nums1[i];
                i++;
            }
            else
            {
                k = nums2[j];
                j++;
            }
        }
        if(l%2==0)
        {
            return (prev+k)/2;
        }
        else
            return k;
    }
}
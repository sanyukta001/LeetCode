class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double m;
        int num[] = new int[nums1.length+nums2.length];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length || j < nums2.length)
        {
            if(i == nums1.length)
                num[k++] = nums2[j++];
            else if(j == nums2.length)
                num[k++] = nums1[i++];
            else if(nums1[i] < nums2[j])
                num[k++] = nums1[i++];
            else
                num[k++] = nums2[j++];
        }
        if(k % 2 == 0)
            m = (double)(num[k/2]+num[(k/2)-1])/2;
        else
            m = num[(k-1)/2];
        return m;
    }
}
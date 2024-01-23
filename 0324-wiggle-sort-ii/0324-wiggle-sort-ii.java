class Solution {
    public void wiggleSort(int[] nums) {
        int l = nums.length;
        int[] copy = new int[l];
        for(int i = 0; i < l; i++)
        {
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        int i;
        if(l%2==0)
            i = (l/2)-1;
        else
            i = l/2;
        int j = l-1;
        for(int k = 0; k < l; k++)
        {
            if(k%2 == 0)
                nums[k] = copy[i--];
            else
                nums[k] = copy[j--];
        }
    }
}
//nb=
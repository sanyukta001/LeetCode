class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        if(arr.length == 0)
            return 0;
        int curr = arr[0];
        int c = 1;
        int max = 1;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == curr+1)
            {
                curr = arr[i];
                c++;
            }
            if(arr[i] > curr+1)
            {
                curr = arr[i];
                c = 1;
            }
            max = Math.max(max,c);
                
        }
        return max;
    }
}
//nb=
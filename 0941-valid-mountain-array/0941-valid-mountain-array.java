class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        int pos = 0;
        for(int i = 1; i < arr.length-1; i++)
        {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
            {
                pos = i;
                break;
            }
        }
        if(pos == 0)
            return false;
        for(int i = 0; i < pos; i++)
        {
            if(arr[i] >= arr[i+1])
                return false;
        }
        for(int i = pos+1;i<arr.length;i++)
        {
            if(arr[i] >= arr[i-1])
                return false;
        }
        return true;
    }
}
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // int c = 0;
        // for(int i = 0; i<hours.length;i++)
        // {
        //     if(hours[i] >= target)
        //         c++;
        // }
        // return c;
        int l = hours.length;
        Arrays.sort(hours);
        int i = 0;
        for(i = 0;i<l;i++)
        {
            if(hours[i] >= target)
            {
                break;
            }
        }
        return l - i;
    }
}
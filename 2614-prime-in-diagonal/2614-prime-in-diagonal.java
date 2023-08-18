class Solution {
    public boolean prime(int x)
    {
        if(x == 1)
            return false;
        if(x == 2)
            return true;
        for(int i = 2; i*i <= x; i++) 
        {
            if(x%i == 0)
                return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int i = 0;
        // int j = 0;
        int s = nums.length;
        // int p = nums[0].length;
        // if(s != p)
            // return 0;
        int max = 0; 
        while(i != s)
        {
            if(prime(nums[i][i]))
            {
                if(max < nums[i][i])
                    max = nums[i][i];
            }
            if(prime(nums[i][s-1-i]))
            {
                if(max<nums[i][s-1-i])
                    max = nums[i][s-1-i];
            }
            i++;
            //j++;
        }
        // i = s-1;
        // j = 0;
        // while(j != s)
        // {
        //     if(prime(nums[i][j]))
        //     {
        //         if(max < nums[i][j])
        //             max = nums[i][j];
        //     }
        //     i--;
        //     j++;
        // }
        return max;
    }
}
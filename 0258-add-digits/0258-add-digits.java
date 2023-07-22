class Solution {
    public int addDigits(int num) {
        
        while(num>9)
        {
            int sum = num;
            int r = 0;
            while(sum > 0)
            {
                int d = sum%10;
                sum/=10;
                r+=d;
            }
            num = r;
        }
        return num;
    }
}
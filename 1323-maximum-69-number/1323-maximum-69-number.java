class Solution {
    int reverse(int x){
        int res = 0;
        while(x>0){
            res = res*10+(x%10);
            x=x/10;
        }
        return res;
    }
    public int maximum69Number (int num) {
        int c = reverse(num);
        int res = 0;
        int i = 0;
        while(c>0){
            if(c%10 == 6 && i == 0)
            {
                res = res*10+9;
                i++;
            }
            else
            {
                res = res*10+(c%10);
            }
            c=c/10;
        }
        return res;
    }
}
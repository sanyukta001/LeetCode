class Solution {
    boolean prime(int x){
        if(x == 2)
            return true;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i == 0)
                return false;
        }
        return true;
    }
    public boolean isUgly(int n) {
        if(n <= 0 )
            return false;
        if(n <= 1)
            return true;
        // for(int i = 2;i <= n/2;i++){
        //     if((n%i == 0)&&(prime(i)== true)){
        //         if(i != 2 &&i!= 3 && i != 5)
        //             return false;
        //     }
        // }
        // return true;
        while(n>1)
        {
            if(n%2==0)
                n=n/2;
            else if(n%3==0)
                n=n/3;
            else if(n%5==0)
                n=n/5;
            else
                return false;
        }
        return true;
    }
}
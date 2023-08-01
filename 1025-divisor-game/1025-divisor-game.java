class Solution {
    public boolean divisorGame(int n) {
        int alice=0;
        int bob=0;
        int count = 1;
        while(n>1)
        {
            alice= 0;
            bob = 0;
            for(int i = 1; i < n ; i++)
            {
                if(n%i == 0)
                {
                    n= n-i;
                    if(count %2 != 0)
                        alice = 1;
                    else 
                        bob = 1;
                    break;
                }    
            }
            count++;
        }
        if(alice == 1)
            return true;
        else 
            return false;
    }
}
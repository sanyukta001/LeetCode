class Solution {
    public int calPoints(String[] operations) 
    {
        int ar[]=new int[operations.length];
        int k=0;
        for(int i=0;i<operations.length;i++)
        {
            char x = operations[i].charAt(0);
            if(x=='+')
            {
                ar[k++] = ar[k-2] + ar[k-3];
            }
            else if(x=='D')
            {
                ar[k++] = (2*ar[k-2]);
            }
            else if(x=='C')
            {
                k--;
            }
            else
            {
                int value = Integer.parseInt(operations[i]);
                ar[k++] = value;
            }
        }
        int sum = 0;
        for(int i = 0;i<k;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }
}
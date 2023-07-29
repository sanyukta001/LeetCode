class Solution 
{
    int fibo(int x,int[] arr)
    {
        if(x == 0)
        {
            arr[0] = 0;
            return 1;
        }
        if(x == 1)
        {
            arr[1] = 1;
            return 1;
        }
       else if(arr[x-1] !=-1 && arr[x-2] !=-1)
        {
            arr[x] = arr[x-1] + arr[x-2];
            return arr[x];
        }
        
        return fibo(x-1,arr)+fibo(x-2,arr);
    }
    public int climbStairs(int n) 
    {
        int arr[] = new int[n+2];
        Arrays.fill(arr,-1);
        return fibo(n+1,arr)-1;
    }
}
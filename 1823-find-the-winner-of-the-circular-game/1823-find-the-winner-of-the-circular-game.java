class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++)
        {
            list.add(i);
        }
        int size = n;
        int t;
        int i = 0;
        // int k1 = k;
        while(size!=1)
        {
            // k1 = k;
            // t = 1;
            t = k;
            // if(k>size)
            //     t = t%size;//k1 = k1%(size);
            // while(t != 1)//t!=k1)
            // {
            //     if(i == size)
            //         i = 0;
            //     i++;
            //     if(i == size)
            //         i = 0;
            //     t--;//t++;
            // }
            i = i + (t-1);
            if(i >= size)
                i = i % (size);
            list.remove(i);
            size--;
            if(i == size)
                i = 0;
        }
        return list.get(0);
    }
}
//nb=
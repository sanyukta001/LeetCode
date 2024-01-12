class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++)
        {
            list.add(i);
        }
        int size = n;
        int i = 0;
        while(size!=1)
        {
            i = i + (k-1);
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
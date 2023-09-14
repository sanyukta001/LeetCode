class Solution {
    public List<Integer> getRow(int numRows) {
        // List<List<Integer>> res = new ArrayList<>();
        List<Integer> f = new ArrayList<Integer>();
        f.add(1);
        // res.add(f);
        if(numRows == 0)
            return f;
        List<Integer> s = new ArrayList<Integer>();
        s.add(1);
        s.add(1);
        // res.add(s);
        if(numRows == 1)
            return s;
        int x = 1;
        int sum = 0;
        while(numRows != 1)
        {
            x = 1;
            List<Integer> s1 = new ArrayList<Integer>();
            s1.add(1);   
            sum = 0;
            for(int item : s)
            {
                if(x == 2)
                {
                    sum = sum+item;
                    x = 2;
                    s1.add(sum);
                    sum  = item;   
                }
                else
                {
                    sum += item;
                    x++;
                }
            }
                s1.add(1);
                //res.add(s1);
                s = s1;
                numRows--;
        }
        return s; 
    }
}
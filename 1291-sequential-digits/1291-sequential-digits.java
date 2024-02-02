class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>(); 
        int x = 0;
        int a = 1;
        int f = (low+"").length();
        while(x <= high)
        {
            x = 0;
            // int a = 1;
            int i;
            for(i = a; i < f+a; i++)
            {
                x = x*10+i;
            }
            if(x>=low && x<=high)
                res.add(x);
            if(i==10)
            {
                f++;
                a = 1;
            }
            else
                a++;
        }
        return res;
    }
}
//nb=
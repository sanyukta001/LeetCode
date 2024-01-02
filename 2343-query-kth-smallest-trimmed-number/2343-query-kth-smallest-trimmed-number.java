import java.util.Arrays;
import java.util.Comparator;
 
// User defined Pair class
class Pair {
    int x;
    String y;
 
    // Constructor
    public Pair(int x, String y) {
        this.x = x;
        this.y = y;
    }
}
 
// class to define user defined comparator
class ArrayOfPairsSorter {
 
    static void sort(Pair[] arr) {
        Comparator<Pair> comparator = new Comparator<>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return (p1.y.compareTo(p2.y));
                                 // To compare the first element
                                // just
                                // change the variable from p1.y
                                // - p2.y to p1.x-p2.x.
            }
        };
        Arrays.sort(arr, comparator);
    }
}
 
class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int len = nums[0].length();
        for(int i = 0; i < queries.length; i++)
        {
            int k = queries[i][0];
            int trim = queries[i][1];
             Pair[] arr = new Pair[nums.length];
            for(int j = 0; j<nums.length; j++)
            {
                String x = nums[j].substring(len-trim);
                //long y = Long.parseLong(x);
                arr[j] = new Pair(j,x);
            }
            ArrayOfPairsSorter.sort(arr);
            ans[i] = arr[k-1].x;
        }
        return ans;
    }
}
//nb=
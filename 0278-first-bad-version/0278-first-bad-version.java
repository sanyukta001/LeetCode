/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int stop = n;
        int mid ;
        while(start<stop)
        {
            mid = start + (stop - start) / 2;
            if(isBadVersion(mid)==true)
                stop = mid;
            else
                start = mid+1;
        }
        return start;
        // while(isBadVersion(n) != false)
        // {
        //     n--;
        // }
        // return n+1;
    }
}
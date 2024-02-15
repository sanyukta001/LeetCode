class Solution {
    static void swap(int[][] arr, int i, int j)
    {
        int temp = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = temp;
        int temp1 = arr[i][1];
        arr[i][1] = arr[j][1];
        arr[j][1] = temp1;
    }
    static int partition(int[][] arr, int low, int high)
    {
        int pivot = arr[high][0];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
            if (arr[j][0] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[][] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public int[][] merge(int[][] intervals) {
        //Arrays.sort(intervals);
        quickSort(intervals,0,intervals.length-1);
        // sortbyColumn(intervals, 0);
        int i = 0;
        int curri = -1, currj = -1;
        List<List<Integer>> list = new ArrayList();
        while(i < intervals.length)
        {
            // if(curri == -1 && currj == -1 && i == intervals.length-1)
            // {
            //     List<Integer> temp = new ArrayList();
            //     temp.add(intervals[i][0]);
            //     temp.add(intervals[i][1]);
            //     list.add(temp);
            //     i++;
            //     continue;
            // }
            
            if(curri == -1 && currj == -1)
            {
                curri = intervals[i][0];
                currj = intervals[i][1];
                i++;
                continue;
            }
            if(intervals[i][0] <= currj)
            {
                currj = Math.max(currj,intervals[i][1]);
                i++;
            }
            else
            {
                List<Integer> temp = new ArrayList();
                temp.add(curri);
                temp.add(currj);
                list.add(temp);
                curri = -1;
                currj = -1;
            }
        }
        List<Integer> temp = new ArrayList();
        temp.add(curri);
        temp.add(currj);
        list.add(temp);
        int[][] res = new int[list.size()][(list.get(0)).size()];
        for(int j = 0; j < list.size(); j++)
        {
            res[j][0] = (list.get(j)).get(0);
            res[j][1] = (list.get(j)).get(1);
        }
        return res;
    }
}
//nb=
class DataStream {
    Map<Integer,Integer> map;
    Queue<Integer> que;
    int value;
    int k;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        map = new HashMap<>();
        que = new LinkedList<>(); 
    }
    
    public boolean consec(int num) {
        que.add(num);
        if(!map.containsKey(num))
            map.put(num,1);
        else
            map.put(num,map.get(num)+1);
        // if(que.size() < k)
        //     return false;
        if(que.size() > k)
        {
            int d = que.remove();
            map.put(d,map.get(d)-1);
            if(map.get(d) == 0)
                map.remove(d);
        }
        if(que.size() == k)
        {
            if(!map.containsKey(value))
                return false;
            if(map.size() == 1 && map.get(value)>0)
                return true;
        }
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
//nb=
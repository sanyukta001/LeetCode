class OrderedStream {
    String[] arr;
    int ptr = 1;

    public OrderedStream(int n) {
        arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        ArrayList<String> k = new ArrayList<>();
        arr[idKey] = value;

        if (ptr != idKey) return k;
        
        for (int i = ptr; i < arr.length && arr[i] != null; i++) {
            k.add(arr[i]);
            ptr++;
        }

        return k;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
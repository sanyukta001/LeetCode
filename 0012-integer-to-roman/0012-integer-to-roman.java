class Solution {
    public String intToRoman(int num) {
        Map<String,Integer> m = new LinkedHashMap<>();
        m.put("M",1000);
        m.put("CM",900);
        m.put("D",500);
        m.put("CD",400);
        m.put("C",100);
        m.put("XC",90);
        m.put("L",50);
        m.put("XL",40);
        m.put("X",10);
        m.put("IX",9);
        m.put("V",5);
        m.put("IV",4);
        m.put("I",1);
        StringBuilder s = new StringBuilder();
        for(Map.Entry<String,Integer> e:m.entrySet()){
            while(num>=e.getValue())
            {
                num= num-e.getValue();
                s.append(e.getKey());
            }
        }
        return s.toString();
    }
}
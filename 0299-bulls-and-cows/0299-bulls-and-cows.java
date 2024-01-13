class Solution {
    public String getHint(String secret, String guess) {
        int cow = 0, bull = 0;
        int[] count1 = new int[10];
        int[] count2 = new int[10];
        for(int i = 0; i < secret.length(); i++)
        {
            char ch = secret.charAt(i);
            if(ch == guess.charAt(i))
                bull++;
                count1[ch-'0']++;
                count2[guess.charAt(i)-'0']++;
            
        }
        for(int i = 0; i < 10; i++)
        {
            if((Math.abs(count2[i] - count1[i]) >= 0)&& count1[i] != 0 && count2[i]!=0)
                cow+=Math.min(count2[i],count1[i]);
            
        }
        
        // if(cow!=0)
            cow = Math.abs(cow - bull);
        String res = bull+"A"+cow+"B";
        return res;
    }
}
//nb=
class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length() < 3)
            return false;
        int alicecount = 0;
        int bobcount = 0;
        for(int i = 1; i < colors.length()-1 ; i++)
        {
            char curr = colors.charAt(i);
            char curr1 = colors.charAt(i-1);
            char curr2 = colors.charAt(i+1);
            if(curr=='A' && curr1 == 'A' && curr2 == 'A')
                alicecount++;
            if(curr == 'B' && curr1 == 'B' && curr2 == 'B')
                bobcount++;
        }
        return alicecount > bobcount;
    }
}
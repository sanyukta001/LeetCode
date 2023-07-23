class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
         int t=-1;
        int id=-1;
        for(int i = 0;i < letters.length;i++)
        {
            if((letters[i] - target) > 0 && t == -1)
            {
                t = letters[i] - target;
                id = i;
            }
            if((letters[i] - target) > 0 && (letters[i] - target) < t)
            {
                t = letters[i] - target;
                id = i;
            }
        }
        if(id!=-1)
            return letters[id];
        else
            return letters[0];
    }
}
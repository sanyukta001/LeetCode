class Solution {
    public boolean halvesAreAlike(String s) {
        int half = s.length()/2;
        int vowel1 = 0, vowel2 = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                if(i >= half)
                    vowel2++;
                else
                    vowel1++;
            }
        }
        return (vowel1 == vowel2);
    }
}
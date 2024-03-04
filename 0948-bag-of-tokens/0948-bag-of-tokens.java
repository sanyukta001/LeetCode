class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length -1, score = 0;
        while(left <= right)
        {
            if(power>=tokens[left])
            {
                power -= tokens[left++];
                score++;
            }
            else
            {
                if(power+tokens[right] >= tokens[left] && score != 0 && right != left)
                {
                    power += tokens[right--];
                    score--;
                }
                else
                    break;
            }
        }
        return score;
    }
}
//nb=
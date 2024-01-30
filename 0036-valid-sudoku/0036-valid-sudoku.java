class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9;  i++)
        {
            HashSet<Character> rmap = new HashSet();
            HashSet<Character> cmap = new HashSet();
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] != '.')
                {
                    if(rmap.contains(board[i][j]))
                        return false;
                    rmap.add(board[i][j]);
                }
                if(board[j][i] != '.')
                {
                    if(cmap.contains(board[j][i]))
                        return false;
                    cmap.add(board[j][i]);
                }
            }
        }
        int rowStart = 0, rowEnd = 2;
        while(rowStart < 7 && rowEnd < 9)
        {
            int columnStart = 0 ,columnEnd = 2;
            while(columnStart < 7 && columnEnd < 9)
            {
                HashSet<Character> gmap = new HashSet<>();
                for(int i = rowStart; i <= rowEnd; i++)
                {
                    for(int j = columnStart; j <= columnEnd; j++)
                    {
                        if(board[i][j] != '.')
                        {
                            if(gmap.contains(board[i][j]))
                                return false;
                            gmap.add(board[i][j]);
                        }
                    }
                }
                columnStart += 3;
                columnEnd += 3;
            }
            rowStart += 3;
            rowEnd += 3;
        }
        
        return true;
        
    }
}
//=nb=
class Solution {
    public boolean isValidSudoku(char[][] board) {
//         for(int i = 0; i < 9;i++)
//         {
//             for(int j = 0; j < 9; j++)
//             {
//                 HashMap<Character, Integer> col = new HashMap<>();
//                 HashMap<Character,Integer> row = new HashMap<>();
//                 char c = board[i][j];
//                 char r = board[j][i];
//                     if(c!='.')
//                     {
//                         if(col.containsKey(c))
//                             return false;
//                         else
//                             col.put(c,1);
//                     }
//                     if(r!='.')
//                     {
//                         if(row.containsKey(r))
//                             return false;
//                         else
//                             row.put(r,1);
//                     }
                
//                 }
//         }
//             int si=0, ei=2, sj=0, ej=2;
//             int count =0;
//         while(count != 9)
//         {
//             count++;
//             HashMap<Character,Integer> check = new HashMap<>();
//             for(int i = si; i <=ei;i++)
//             {
//                 for(int j =sj;j<=ej;j++)
//                 {
//                     char x = board[i][j];
//                     if(x!='.')
//                     {
//                         if(check.containsKey(x))
//                             return false;
//                         else
//                             check.put(x,1);
//                     }
//                 }
//             }
//             if(ei == 8)
//             {
//                 sj = sj + 3;
//                 ej = ej + 3;
//                 si = 0;
//                 ei = 2;
//             }
//             else
//             {
//             si = si + 3;
//             ei = ei + 3;
//             }
//         }
//         return true;
        
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
            // HashSet<Character> gmap = new HashSet<>();
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
class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        
         int x = 0;
        for(int i = 0; i < operations.size(); i++)
        {
            int l = operations[i].length();
            if(operations[i][0]=='+')
                x = x + 1;
            if(operations[i][0]=='-')
                x = x - 1;
            if(operations[i][l-1]=='-')
                x = x - 1;
            if(operations[i][l-1]=='+')
                x = x + 1;
        }
        return x;
    }
};
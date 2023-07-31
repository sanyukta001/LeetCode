class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        vector<int> sep;
        for(int i = 0; i < nums.size();i++ )
        {
            int x = nums[i];
            vector<int> sep1;
            while(x>0)
            {
                sep1.push_back(x%10);
                x=x/10;
            }
            for(int j = sep1.size()-1;j>=0;j--)
                sep.push_back(sep1[j]);
        }
        return sep;
    }
};
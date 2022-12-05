class Solution 
{
public:
    bool containsDuplicate(vector<int>& nums) 
    {
        int k = 1;
        map<int,int> m;
        for(int i = 0; i < nums.size(); i++)
        {
            m[nums[i]] = k++;
        }
        if(m.size() == nums.size())
            return false;
        else
            return true;
    }
};
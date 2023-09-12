class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
    int m = nums2.size();
    unordered_set<int> uset;
    unordered_set<int> ansset;
    
    // Insert all elements of nums1 into the uset
    for (int i = 0; i < n; i++) {
        uset.insert(nums1[i]);
    }
    
    // Find common elements between nums1 and nums2
    for (int i = 0; i < m; i++) {
        int key = nums2[i];
        if (uset.find(key) != uset.end()) {
            ansset.insert(nums2[i]);
        }
    }
    
    vector<int> ans;
    
    // Populate the ans vector with elements from ansset
    for (auto itr = ansset.begin(); itr != ansset.end(); itr++) {
        ans.push_back((*itr));
    }
    
    return ans;
    }
};
//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    void segregateElements(int arr[],int n)
    {
        // Your code goes here
        //int j = n-1;
        // for(int i = n-1; i >= 0;i--)
        // {
        //     if(arr[i] < 0)
        //     {
        //         //swap(arr[i],arr[j]);
        //         int t = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = t;
        //         j--;
        //     }
        // }
        vector<int> a,b;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < 0)
                a.push_back(arr[i]);
            else
                b.push_back(arr[i]);
        }
        int k = 0;
        for(int i = 0; i < b.size(); i++)
            arr[k++] = b[i];
        for(int i = 0; i < a.size(); i++)
            arr[k++] = a[i];
    }
};

//{ Driver Code Starts.
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		Solution ob;
		ob.segregateElements(a,n);
		
        for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
		cout<<endl;
	}
}

// } Driver Code Ends
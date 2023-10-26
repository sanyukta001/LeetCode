//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
        char[] arr = new char[str.length()];
        // Arrays.fill(arr,0);
        for(int i = 0;i < str.length();i++)
        {
            arr[i] = str.charAt(i);
            // arr[x-'a']++;
        }
        Arrays.sort(arr);
        int i = 0, j = str.length()-1;
        while(i<=j)
        {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return String.valueOf(arr);
        // String st ="";
        // for(int i =str.length()-1;i >=0;i--)
        // {
        //     st = st+arr[i];
        // }
        
        // String st = "";
        // for(int i = 25; i >=0;)
        // {
        //     if(arr[i] == 0)
        //     {
        //         i--;
        //         continue;
        //     }
        //     st = st + (char)(i+97);
        //     arr[i]--;
        // }
        // return st;
    }
} 
//nb=
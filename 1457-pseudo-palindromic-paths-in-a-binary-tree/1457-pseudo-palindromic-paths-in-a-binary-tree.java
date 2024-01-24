/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = 0;
    int[] digit;
    public int pseudoPalindromicPaths (TreeNode root) {
        digit = new int[10];
        dfs(root);
        return res;
    }
    void dfs(TreeNode root)
    {
        if(root == null)
            return;
        digit[root.val]++;
        if(root.left == null && root.right == null)
        {
            if(isPalin())
                res++;
        }
        else{
        dfs(root.left);
        dfs(root.right);
        }
        digit[root.val]--;
    }
    boolean isPalin()
    {
        int f = 0;
        for(int i = 0; i < 10; i++)
        {
            if(digit[i]%2!=0)
                f++;
        }
        if(f>=2)
            return false;
        return true;
    }
}
//nb=
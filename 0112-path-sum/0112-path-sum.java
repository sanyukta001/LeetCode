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
    boolean path(TreeNode root, int tar,int sum)
    {
        if(root == null)
            return false;
        sum+=root.val;
        if(root.left == null && root.right == null)
            return (sum == tar);
        return (path(root.left,tar,sum) || path(root.right,tar,sum));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,targetSum,0);
    }
}
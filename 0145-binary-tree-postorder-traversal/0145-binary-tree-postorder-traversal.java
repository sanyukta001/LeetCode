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
         List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer> res = new ArrayList<>();
        if(root == null)
        {
            return res;
        }
        if(root.left!=null)
            postorderTraversal(root.left);
        if(root.right!=null)
            postorderTraversal(root.right);
        res.add(root.val);
        return res;
    }
}
//nb=
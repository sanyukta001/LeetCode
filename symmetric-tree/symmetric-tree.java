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
    boolean calcSymm(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        else if(root1 == null || root2 == null) return false;
        // else if(root1.val == root2.val) return true;
        else if(root1.val != root2.val) return false;
        // if((root1.left == null && root2.right != null)||(root1.right == null && root2.left != null)||(root1.left != null && root2.right == null)||(root1.right != null && root2.left == null)) return false;
        // boolean first , second;
        // if(root1.left != null && root2.right != null) first = calcSymm(root1.left,root2.right);
        // if(root1.right != null && root2.left != null) second = calcSymm(root1.right,root2.left);
        return (calcSymm(root1.left,root2.right) && calcSymm(root1.right,root2.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return calcSymm(root.left,root.right);
    }
}
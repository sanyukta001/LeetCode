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
    int result;
    public int maxSumBST(TreeNode root) {
        call(root);
        
        return result < 0 ? 0 : result;
    }
    int[] call(TreeNode root)
    {
        if(root == null)
            return new int[] {Integer.MAX_VALUE , Integer.MIN_VALUE , 0};
        int left[] = call(root.left);
        int right[] = call(root.right);
        if(left[1]>=root.val || right[0]<=root.val)
            return new int[] {Integer.MIN_VALUE,Integer.MAX_VALUE, 0};
        int sum = left[2]+right[2]+root.val;
        result = Math.max(result,sum);
        return new int[] {Math.min(left[0],root.val),Math.max(right[1],root.val),sum};
    }
}
//nb=
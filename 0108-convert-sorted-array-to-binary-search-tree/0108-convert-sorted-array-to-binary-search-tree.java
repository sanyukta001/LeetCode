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
    public TreeNode rec(int[] nums,int start, int stop){
        int mid = (start+stop)/2;
        if(start>stop)
            return null;
        else
        {
            TreeNode root = new TreeNode(nums[mid]);
            root.left = rec(nums,start, mid-1);
            root.right =rec(nums,mid+1,stop);
            return root;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        // int mid = (nums.length)/2;
        if(nums.length == 0)
            return null;
        int start = 0;
        int stop = nums.length-1;
        return rec(nums,start,stop);
        // TreeNode root = new TreeNode(mid);
        
    }
}
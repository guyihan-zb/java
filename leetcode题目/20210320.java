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
    public TreeNode increasingBST(TreeNode root) {
        return help(root, null);
    }
    public TreeNode help(TreeNode node, TreeNode prev) {
    	if(node == null)
    		return prev;

        TreeNode head = help(node.left, node);

        node.left = null;
        node.right = help(node.right, prev);

        return head;

    }
}
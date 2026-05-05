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
    boolean isTreeBalanced = true; 

    public boolean isBalanced(TreeNode root) {

        maxDepth(root);
        return isTreeBalanced;
        
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int difference = Math.abs(left - right);

         // ✅ Check balance at current node
        if (difference > 1) {
            isTreeBalanced = false;
        }

        return 1 + Math.max(left, right);
    }
}

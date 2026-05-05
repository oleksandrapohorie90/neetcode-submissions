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
    
    private List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root) {
        //in order is when we call a leftmost subtree leaf
        //print root node
        //call right most subtree leaf
        res = new ArrayList<>();
        inorder(root);
        return res;
    }

    private void inorder(TreeNode node){
        if(node == null) return; //when void this is good
        
        inorder(node.left);
        res.add(node.val);
        inorder(node.right);
    }
    
}
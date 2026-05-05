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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    // Base case:
    // If the main tree has become null, but subRoot is not null,
    // it means we've traversed all the way and did not find subRoot.
    if (root == null) {
        return false;
    }

    // Check if the current subtree starting at 'root' matches subRoot.
    // If yes, we found subRoot inside root.
    if (isSameTree(root, subRoot)) {
        return true;
    }

    // Otherwise, recursively check whether subRoot is a subtree
    // of the left child of root, or the right child of root.
    // We keep moving down the tree looking for a match.
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if both null then they are the same
        if(p == null && q == null) return true;
        //if both are checked and one of them is null then are not the same
        if(p == null && q != null) return false;
        if(p != null && q == null) return false;
        //if both are not null, but val are different then are not the same
        if(p.val != q.val) return false;
        //call recursion on the left subtree to open the tree
        if(!isSameTree(p.left, q.left)) return false;
        //call recursion on the right subtree to open the tree
        if(!isSameTree(p.right, q.right)) return false;
        return true;
    }
}

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
    public TreeNode deleteNode(TreeNode root, int key) {
        //base case
        if(root==null){
            return root;
        }

        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else if(key < root.val){
            root.left = deleteNode(root.left, key);
        } else{
            //??
            if(root.left == null) return root.right;
             if(root.right == null) return root.left;

        TreeNode cur = root.right;
        while(cur.left != null){
            cur = cur.left;
        }
        root.val = cur.val;
        root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

        
    }

    //root = [5,3,9,1,4], key = 3
    // public TreeNode searchNode(TreeNode root, int key) {

    //     if(key > root.val){
    //         root = searchNode(root.right, key)
    //         if(key == root.val){
    //             return searchNode(root.right,key);
    //         }
    //     }else if(key < root.val){
    //         root = searchNode(root.left, key)
    //         if(key == root.val){
    //             return searchNode(root.left,key);
    //         }

    //         return root;
    // }

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //Your Output:
//[[1,2,3,4],[5,6],[7]]
        //Expected output:
//[[1],[2,3],[4,5,6,7]]
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res; 

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); //1
        
        while(!q.isEmpty()){
        int size = q.size();
        List<Integer> subList = new ArrayList<>();
        for(int i = 0; i < size; i++){
        TreeNode node = q.poll(); //1
         //add to the sublist our node val
        subList.add(node.val);
        
        //we took the root from the queue and assigned
        //it to the newly created node
        //FIFO will peek and remove 2 first bc 2 was added first
        
        if(node.left != null){ 
        q.add(node.left);//add the left child
        }
        if(node.right != null){
        q.add(node.right);//add the right child
        }
       
        }

        res.add(subList);
        //reset the sublist
        //subList = new ArrayList<>();
        }
        
        return res;
    }
}

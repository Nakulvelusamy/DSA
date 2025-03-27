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
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> n=new ArrayList<>();
         
        a(root,n);
      return n;  
    }
   
    static void a(TreeNode root,List<Integer> n){
        if(root == null){
            return;
        }
        n.add(root.val);
        a(root.left,n);
        a(root.right,n);
    } 
     
}

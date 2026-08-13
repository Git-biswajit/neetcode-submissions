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
    public boolean isBalanced(TreeNode root) {
        return balanced(root)!=-1;        
    }
    public int balanced(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft= balanced(root.left);
        if(lft==-1){
            return -1;
        }
        int rgt= balanced(root.right);
        if(rgt==-1){
            return -1;
        }
        int diff = Math.abs(lft-rgt);
        if(diff>1){
            return -1;
        }
        return 1+Math.max(lft,rgt);

    }
}

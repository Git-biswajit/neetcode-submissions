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
    int count =0;
    public int goodNodes(TreeNode root) {
        findNodes(root,Integer.MIN_VALUE);
        return count;      
    }
    public void findNodes(TreeNode root, int maxValue){
        if(root==null){
            return;
        }
        if(root.val>=maxValue){
            count++;
        }
        maxValue = Math.max(root.val,maxValue);
        findNodes(root.left,maxValue);
        findNodes(root.right,maxValue);
    }
}

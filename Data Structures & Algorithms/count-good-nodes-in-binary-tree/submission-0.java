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
    int count=0;
    public int goodNodes(TreeNode root) {
        dfs(root,Integer.MIN_VALUE);
        return count;                
    }
    public void dfs(TreeNode root, int maxVal){
        if(root==null){
          return;
        }
        if(root.val>=maxVal){
            count++;
        }
        maxVal = Math.max(root.val,maxVal);
        dfs(root.left,maxVal);
        dfs(root.right,maxVal);
       
    }
}

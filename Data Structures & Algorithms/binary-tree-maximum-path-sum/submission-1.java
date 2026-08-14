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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxSum;        
    }
    public int maxPath(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft = Math.max(0, maxPath(root.left));
        int rgt = Math.max(0, maxPath(root.right));
        int curSum = lft + root.val + rgt;
        maxSum = Math.max(maxSum,curSum);
        return root.val + Math.max(lft,rgt);
    }
}

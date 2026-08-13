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
     List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        sortedTree(root);
        int sz = list.size();
        for(int i=0;i<sz;i++){
            if(i==k-1){
                return list.get(i);
            }
        }
        return -1;
        
    }
    public void sortedTree(TreeNode root){
        if(root==null){
            return;
        }
        sortedTree(root.left);
        list.add(root.val);
        sortedTree(root.right);
    }
}

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

public class Codec {
    int index=0;
     List<String> values = new ArrayList<>();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        srz(root);  
        return String.join(",", values);
        
    }
    public void srz(TreeNode root){
        if(root==null){
            values.add("null");
            return;
        }
        values.add(String.valueOf(root.val));
        srz(root.left);
        srz(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] val = data.split(",");
        return buildTree(val);        
    }
    public TreeNode buildTree(String[] val){
        if(val[index].equals("null")){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val[index]));
        index++;
        root.left = buildTree(val);
        root.right = buildTree(val);
        return root;
    }
}

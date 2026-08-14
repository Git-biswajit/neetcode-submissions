class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        serialize(p, list1);
        serialize(q, list2);

        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {

            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        return true;
    }

    public void serialize(TreeNode root, List<String> list) {

        if (root == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(root.val));

        serialize(root.left, list);
        serialize(root.right, list);
    }
}
public class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String result = Integer.toString(root.val);

        if (root.left != null || root.right != null) {
            result += "(" + tree2str(root.left) + ")";
        }

        if (root.right != null) {
            result += "(" + tree2str(root.right) + ")";
        }

        return result;
    }
}

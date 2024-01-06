package solutions.algorithms._0_999._226_Invert_Binary_Tree;

import commons.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        swapChild(root);
        return root;
    }

    private void swapChild(TreeNode root) {
        if (root.left != null) {
            swapChild(root.left);
        }
        if (root.right != null) {
            swapChild(root.right);
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
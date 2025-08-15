package solutions.algorithms._0_999._226_Invert_Binary_Tree;

import commons.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        invert(root);
        return root;
    }

    void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invert(root.left);
        invert(root.right);
    }
}
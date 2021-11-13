package solutions.algorithms._110_Balanced_Binary_Tree;

import commons.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        return getTreeDepth(root, 0) != -1;
    }

    public int getTreeDepth(TreeNode node, int depth) {

        int leftDepth = depth;
        int rightDepth = depth;
        if (node.left != null) {
            leftDepth = getTreeDepth(node.left, ++leftDepth);
            if (leftDepth == -1) {
                return -1;
            }
        }
        if (node.right != null) {
            rightDepth = getTreeDepth(node.right, ++rightDepth);
            if (rightDepth == -1) {
                return -1;
            }
        }
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth);
    }
}
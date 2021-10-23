package solutions._104_Maximum_Depth_of_Binary_Tree;

import commons.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getDepth(root, 1);
    }

    public int getDepth(TreeNode node, int depth) {
        int leftDepth = depth;
        int rightDepth = depth;
        if (node.left != null) {
            leftDepth = getDepth(node.left, ++leftDepth);
        }
        if (node.right != null) {
            rightDepth = getDepth(node.right, ++rightDepth);
        }
        return Math.max(leftDepth, rightDepth);
    }
}
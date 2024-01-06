package solutions.algorithms._0_999._111_Minimum_Depth_of_Binary_Tree;

import commons.TreeNode;

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getDepth(root, 1, Integer.MAX_VALUE);
    }

    public int getDepth(TreeNode node, int depth, int shortestFound) {
        int leftDepth = depth;
        int rightDepth = depth;
        boolean leftUpdated = false;
        boolean rightUpdated = false;
        if (node.left != null) {
            if (++leftDepth > shortestFound) {
                return shortestFound;
            }
            leftDepth = getDepth(node.left, leftDepth, shortestFound);
            leftUpdated = true;
            if (shortestFound > leftDepth) {
                shortestFound = leftDepth;
            }
        }
        if (node.right != null) {
            if (++rightDepth > shortestFound) {
                return shortestFound;
            }
            rightDepth = getDepth(node.right, rightDepth, shortestFound);
            rightUpdated = true;
        }
        if (!leftUpdated) {
            return rightDepth;
        }
        if (!rightUpdated) {
            return leftDepth;
        }
        return Math.min(leftDepth, rightDepth);
    }
}
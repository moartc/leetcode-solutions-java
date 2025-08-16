package solutions.algorithms._0_999._110_Balanced_Binary_Tree;

import commons.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        int depth = depth(root);
        // if it's -1 then it's unbalanced, otherwise is balanced
        return depth != -1;
    }

    // returns depth as an integer <0...Int.MAX> or -1 in the case of unbalanced true
    private int depth(TreeNode node) {

        TreeNode left = node.left;
        TreeNode right = node.right;

        int leftDepth = 0;
        int rightDepth = 0;
        if (left != null) {
            int depthInside = depth(left);
            if (depthInside == -1) {
                // if it's -1 - it's unbalanced inside - return it
                return -1;
            }
            leftDepth = 1 + depthInside;
        }

        if (right != null) {
            int depthInside = depth(right);
            if (depthInside == -1) {
                // if it's -1 - it's unbalanced inside - return it
                return -1;
            }
            rightDepth = 1 + depthInside;
        }

        // check if it's balanced
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        } else {
            // else return greater depth
            return Math.max(leftDepth, rightDepth);
        }


    }

}
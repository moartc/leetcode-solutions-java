package solutions.algorithms._0_999._98_Validate_Binary_Search_Tree;

import commons.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isNodeValid(root, 0, 0, false, false);
    }

    boolean isNodeValid(TreeNode node, int min, int max, boolean isMin, boolean isMax) {

        if (node == null) {
            return true;
        }
        boolean left = node.left == null || (node.left.val < node.val && (!isMin || node.left.val > min));
        boolean right = node.right == null || (node.right.val > node.val && (!isMax || node.right.val < max));
        if (!left || !right) {
            return false;
        } else {
            return isNodeValid(node.left, min, node.val, isMin, true) && isNodeValid(node.right, node.val, max, true, isMax);
        }
    }
}
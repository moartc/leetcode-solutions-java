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

        /*
        for every node check if
         - left.value if non-null is lower than node value
         - right.value if non-null is greater than node value
        do the same for each child node
        if any of them is invalid then return to caller false

        Also, for the right branch I have the lowest possible value that every node has to be greater than
        for the left branch I have the max possible value that every node has to be smaller than
        so when I visit the left branch I update the highest value
        and when I visit the right branch I update the lowest acceptable value

        also:
        Integer.MIN_VALUE and Integer.MAX_VALUE are valid node values, so I track if they are set with 2 additional boolean parameters
         */
        return validated(root, Integer.MIN_VALUE, Integer.MAX_VALUE, false, false);
    }

    // I am not visiting null nodes
    boolean validated(TreeNode node, int lowestAllowed, int highestAllowed, boolean isLowestAllowedSet, boolean isHighestAllowedSet) {

        var nodeV = node.val;
        // first check children
        if (node.left != null) {
            if (node.left.val >= nodeV || (isLowestAllowedSet && node.left.val <= lowestAllowed)) {
                return false;
            }
        }

        if (node.right != null) {
            if (node.right.val <= nodeV || (isHighestAllowedSet && node.right.val >= highestAllowed)) {
                return false;
            }
        }

        // then visit them
        boolean isLeftValid = true;
        boolean isRightValid = true;

        if (node.left != null) {
            isLeftValid = validated(node.left, lowestAllowed, nodeV, isLowestAllowedSet, true);
        }
        if (node.right != null) {
            isRightValid = validated(node.right, nodeV, highestAllowed, true, isHighestAllowedSet);
        }
        return isLeftValid && isRightValid;
    }


    // Before revisiting I had this code:
    public boolean isValidBST_v1(TreeNode root) {
        return isNodeValid_v1(root, 0, 0, false, false);
    }

    boolean isNodeValid_v1(TreeNode node, int min, int max, boolean isMin, boolean isMax) {

        if (node == null) {
            return true;
        }
        boolean left = node.left == null || (node.left.val < node.val && (!isMin || node.left.val > min));
        boolean right = node.right == null || (node.right.val > node.val && (!isMax || node.right.val < max));
        if (!left || !right) {
            return false;
        } else {
            return isNodeValid_v1(node.left, min, node.val, isMin, true) && isNodeValid_v1(node.right, node.val, max, true, isMax);
        }
    }
}
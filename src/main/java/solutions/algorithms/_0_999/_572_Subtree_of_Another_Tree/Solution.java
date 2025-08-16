package solutions.algorithms._0_999._572_Subtree_of_Another_Tree;

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        /*
        just visit all nodes in the main tree,
        if it's value is equal to the subRoot value - check if they are equal if so, then return true up
        if not, then continue check for left node and right node, if any of them returns true - return it as an answer
         */

        return visit(root, subRoot);
    }

    boolean visit(TreeNode root, TreeNode subRoot) {

        if (areEqual(root, subRoot)) {
            return true;
        }

        if (root.left != null && visit(root.left, subRoot)) {
            return true;
        }
        if (root.right != null && visit(root.right, subRoot)) {
            return true;
        }
        return false;
    }

    boolean areEqual(TreeNode root, TreeNode subRoot) {
        if ((root != null && subRoot == null) || (root == null && subRoot != null)) {
            // there is no sub root node - it doesn't matter what's in the root
            return false;
        }
        if (root == null) {
            return true;
        }
        // here both are non-null
        if (root.val != subRoot.val) {
            return false;
        }
        return areEqual(root.left, subRoot.left) && areEqual(root.right, subRoot.right);
    }
}
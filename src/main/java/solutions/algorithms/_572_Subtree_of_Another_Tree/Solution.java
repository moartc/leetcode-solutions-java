package solutions.algorithms._572_Subtree_of_Another_Tree;

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
        return findSubRoot(root, subRoot);
    }

    boolean findSubRoot(TreeNode node, TreeNode subRoot) {
        boolean equal = isEqual(node, subRoot);
        if (equal) {
            return true;
        } else if (node != null) {
            return findSubRoot(node.left, subRoot) || findSubRoot(node.right, subRoot);
        }
        return false;
    }

    boolean isEqual(TreeNode startNode, TreeNode subRoot) {
        if (startNode == null && subRoot == null) {
            return true;
        } else if (startNode == null) {
            return false;
        } else if (subRoot == null) {
            return false;
        } else {
            if (startNode.val != subRoot.val) {
                return false;
            } else {
                return isEqual(startNode.left, subRoot.left) && isEqual(startNode.right, subRoot.right);
            }
        }
    }
}
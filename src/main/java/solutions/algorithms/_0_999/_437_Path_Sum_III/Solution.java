package solutions.algorithms._0_999._437_Path_Sum_III;

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

    public int pathSum(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }
        return findPath(root, target) + pathSum(root.left, target) + pathSum(root.right, target);
    }

    int findPath(TreeNode node, long remaining) {
        int paths = 0;
        int val = node.val;
        long newRemaining = remaining - val;
        if (newRemaining == 0) {
            paths++;
        }
        if (node.left != null) {
            paths += findPath(node.left, newRemaining);
        }
        if (node.right != null) {
            paths += findPath(node.right, newRemaining);
        }
        return paths;
    }

}
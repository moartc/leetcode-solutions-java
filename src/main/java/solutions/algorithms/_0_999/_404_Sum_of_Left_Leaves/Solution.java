package solutions.algorithms._0_999._404_Sum_of_Left_Leaves;

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
    public int sumOfLeftLeaves(TreeNode root) {

        return sum(root, false);
    }

    int sum(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            if (isLeft) {
                return node.val;
            } else {
                return 0;
            }
        } else {
            return sum(node.left, true) + sum(node.right, false);
        }
    }
}
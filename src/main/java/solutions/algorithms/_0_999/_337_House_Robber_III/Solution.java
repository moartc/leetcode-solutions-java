package solutions.algorithms._0_999._337_House_Robber_III;

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

    /*
    When I start at the root, I can either rob it or not:
    1. If I rob it I visit its 2 children (if they exist) but cannot rob them
    2. If I don't rob it, I visit the same children, and this time I can rob them
      - even when I can rob a child, I can also skip it and visit its children which I can rob.

    When I reach a leaf, I go back, and on returning I compare both paths (if they exist)
     and return the higher value up.

     update: it's to slow, so I wil handle 2 cases during one visit
     */


    public int rob(TreeNode root) {

        // idx 0 - no-rob / 1 - rob
        int[] res = visit(root);
        return Math.max(res[0], res[1]);
    }

    private int[] visit(TreeNode node) {

        if (node == null) {
            return new int[]{0, 0};
        } else {

            int[] leftRes = visit(node.left);
            int[] rightRes = visit(node.right);

            // case when I rob - current node, and sum of left and right with "no-rob" value
            int robValue = node.val + leftRes[0] + rightRes[0];
            // case when I skip
            // sum of max of any left (either rob or no-rob) and right (also rob or no-rob)
            int noRobValue = Math.max(leftRes[0], leftRes[1]) + Math.max(rightRes[0], rightRes[1]);
            return new int[]{noRobValue, robValue};
        }
    }

}
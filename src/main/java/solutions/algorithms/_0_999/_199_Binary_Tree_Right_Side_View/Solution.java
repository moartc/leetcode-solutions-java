package solutions.algorithms._0_999._199_Binary_Tree_Right_Side_View;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> rightSideView(TreeNode root) {

        /*
        Initial approach:
        Total number of nodes == 100. Because they all can be at a separate level, I can have 100 values in my result list.
        I can create an array with a size of 100 and add to it values for each level,
        I can do it by visiting nodes from right to left and adding values for each level, where values is still missing.

        Updated idea:
        I can track added levels by tracking the size of my result list
        The rest of the solution remains the same.
         */
        List<Integer> finalList = new ArrayList<>(100);

        if (root == null) {
            return finalList;
        }

        visit(root, finalList, 0);

        return finalList;
    }

    void visit(TreeNode node, List<Integer> finalList, int level) {
        // not added yet
        if (finalList.size() < level + 1) {
            finalList.add(node.val);
        }

        // visit first right
        if (node.right != null) {
            visit(node.right, finalList, level + 1);
        }
        // and then the left one
        if (node.left != null) {
            visit(node.left, finalList, level + 1);
        }
    }
}
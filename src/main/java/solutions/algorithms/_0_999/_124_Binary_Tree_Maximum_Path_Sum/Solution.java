package solutions.algorithms._0_999._124_Binary_Tree_Maximum_Path_Sum;

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

    int bestFound = Integer.MIN_VALUE;
    /*
        I could start from the root, get its value and the best left path and the best right path, then
        check which total path is the best:
        1. root node only
        2. root node + left / root node + right (if one of them has a positive and one has a negative value)
        3. root node + left + right (if both left and right paths have positive values)

        I can calculate it recursively - for each node updating a global "best found".
        What's important: to the caller I can return only left or right path
         */


    public int maxPathSum(TreeNode root) {

        var rootValue = root.val;
        var left = findBestPath(root.left);
        var right = findBestPath(root.right);

        // compare with the global
        int resultForRoot = rootValue;
        if (left > 0) {
            resultForRoot += left;
        }
        if (right > 0) {
            resultForRoot += right;
        }
        if (resultForRoot > bestFound) {
            bestFound = resultForRoot;
        }

        return bestFound;

    }

    int findBestPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        // calculate all possible options here
        int leftPath = findBestPath(node.left);
        int rightPath = findBestPath(node.right);

        int bestResult = node.val;
        if (leftPath > 0) {
            bestResult += leftPath;
        }
        if (rightPath > 0) {
            bestResult += rightPath;
        }
        if (bestResult > bestFound) {
            bestFound = bestResult;
        }
        // but return only best path

        int greaterPath = Integer.max(leftPath, rightPath);
        if (greaterPath > 0) {
            return node.val + greaterPath;
        } else {
            return node.val;
        }
    }
}
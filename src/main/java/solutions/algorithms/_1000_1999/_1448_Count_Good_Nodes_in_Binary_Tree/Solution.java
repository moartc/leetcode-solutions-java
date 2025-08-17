package solutions.algorithms._1000_1999._1448_Count_Good_Nodes_in_Binary_Tree;

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

    int globalCounter = 0;

    public int goodNodes(TreeNode root) {

        /*
        node is good, if there are no values greater than root
        1. root is always good
        2. value can be equal
        3. value of root counts for children
        4. Min value -10^4 so the initial max set to Integer.Min

        idea:
        1. start from top (root) - remember its value as the highest
        2. for each visited check if it's value is greater than max found

        Use DFS for it
         */

        visit(root, Integer.MIN_VALUE);

        return globalCounter;
    }

    void visit(TreeNode node, int maxFound) {
        if (node.val >= maxFound) {
            // add another good node
            globalCounter++;
        }

        int newMax = Math.max(maxFound, node.val);


        if (node.left != null) {
            visit(node.left, newMax);
        }

        if (node.right != null) {
            visit(node.right, newMax);
        }
    }
}
package solutions.algorithms._2000_2999._2265_Count_Nodes_Equal_to_Average_of_Subtree;

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

    int globCtr = 0;

    public int averageOfSubtree(TreeNode root) {

        count(root);
        return globCtr;
    }

    // returns number of nodes & sum
    int[] count(TreeNode node) {

        if (node == null) {
            return new int[]{0, 0};
        }

        int[] leftSubTree = count(node.left);
        int[] rightSubTree = count(node.right);

        int totalNodeInSubtrees = leftSubTree[0] + rightSubTree[0];
        int totalSumInSubtrees = leftSubTree[1] + rightSubTree[1];

        int totalNodes = totalNodeInSubtrees + 1;
        int totalSum = totalSumInSubtrees + node.val;
        double avg = totalSum / totalNodes;
        if (avg == node.val) {
            globCtr++;
        }
        return new int[]{totalNodes, totalSum};
    }


}
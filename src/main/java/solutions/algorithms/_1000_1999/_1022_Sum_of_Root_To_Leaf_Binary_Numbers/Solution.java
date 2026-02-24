package solutions.algorithms._1000_1999._1022_Sum_of_Root_To_Leaf_Binary_Numbers;

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
    I can track the 'current value'. At each node I shift it left and add the value of the current node.
    When I reach a leaf I can add it to a global variable - to make it simpler.
     */
    int totalSum = 0;

    public int sumRootToLeaf(TreeNode root) {

        if (root == null) {
            return 0;
        }
        sumToLeaf(root, 0);

        return totalSum;

    }

    void sumToLeaf(TreeNode node, int currentValue) {
        // add the current one
        currentValue <<= 1;
        currentValue += node.val;
        if (node.left == null && node.right == null) {
            totalSum += currentValue;
        } else {
            if (node.left != null) {
                sumToLeaf(node.left, currentValue);
            }
            if (node.right != null) {
                sumToLeaf(node.right, currentValue);
            }
        }
    }
}
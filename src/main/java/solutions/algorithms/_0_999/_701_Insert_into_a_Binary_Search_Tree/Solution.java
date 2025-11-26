package solutions.algorithms._0_999._701_Insert_into_a_Binary_Search_Tree;

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
    Let's insert it as a leaf
    At each step I check the current node, if my value is greater, I go right, if it's lower I go left
    When I reach a node with no leaf to visit, I add it there
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        } else {
            visitAndAdd(root, val);
            // return root here
            return root;
        }
    }

    void visitAndAdd(TreeNode node, int val) {
        if (node.val < val) { // I should go right
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                visitAndAdd(node.right, val);
            }
        } else { // go left
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                visitAndAdd(node.left, val);
            }
        }
    }
}
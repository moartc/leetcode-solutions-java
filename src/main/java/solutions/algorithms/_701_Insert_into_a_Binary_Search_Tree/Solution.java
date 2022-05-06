package solutions.algorithms._701_Insert_into_a_Binary_Search_Tree;

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            insert(root, val);
        }
        return root;
    }

    void insert(TreeNode node, int val) {
        if (node.val < val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insertIntoBST(node.right, val);
            }
        } else { // node.val > val
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insertIntoBST(node.left, val);
            }
        }
    }
}
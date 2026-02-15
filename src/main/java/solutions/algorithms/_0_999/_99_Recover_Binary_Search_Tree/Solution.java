package solutions.algorithms._0_999._99_Recover_Binary_Search_Tree;

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
    since only one pair is invalid I can swap the values without changing the tree structure
    Since it's a BST in order should give me the elements in sorted order.
    I can then find the 2 that are in the wrong places and swap them.
    improve: try to do it without creating an additional array
    update: it beats 18.49% without 'improvement'
    improvement implemented + some cleanup: beats 99.95%
     */

    TreeNode prev;
    TreeNode firstV;
    TreeNode secondV;

    public void recoverTree(TreeNode root) {
        visit(root);
        swapNodes(firstV, secondV);
    }

    void visit(TreeNode node) {
        if (node != null) {
            visit(node.left);
            if (prev != null && prev.val > node.val) {
                if (firstV == null) {
                    firstV = prev;
                }
                secondV = node;
            }
            prev = node;
            visit(node.right);
        }
    }

    void swapNodes(TreeNode f, TreeNode s) {
        int valFirst = f.val;
        f.val = s.val;
        s.val = valFirst;
    }
}
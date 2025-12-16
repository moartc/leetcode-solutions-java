package solutions.algorithms._1000_1999._1325_Delete_Leaves_With_a_Given_Value;

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
    I could do something like post-order.
    I enter a node, visit and "handle" its left child, then the right child. When I am back, I check
    if the left has no children - if so, I delete it. The same for the right one.
    I check of course if the value is equal to the target value.
     */
    public TreeNode removeLeafNodes(TreeNode root, int target) {


        visitAndDelete(root, target);
        // here I think it might be possible that root is also equal to target and I should return null
        if (root.val == target && root.left == null && root.right == null) {
            return null;
        } else {
            return root;
        }
    }

    private void visitAndDelete(TreeNode node, int target) {

        if (node == null) {
            return;
        }
        visitAndDelete(node.left, target);
        visitAndDelete(node.right, target);

        // check if the left one can be deleted
        if (node.left != null && node.left.left == null && node.left.right == null && node.left.val == target) {
            // I should delete the left one
            node.left = null;
        }

        if (node.right != null && node.right.left == null && node.right.right == null && node.right.val == target) {
            // I should delete the left one
            node.right = null;
        }
    }
}
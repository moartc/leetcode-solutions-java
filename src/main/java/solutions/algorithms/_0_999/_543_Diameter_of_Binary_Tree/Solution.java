package solutions.algorithms._0_999._543_Diameter_of_Binary_Tree;

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


    int maxFound = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {

        /*
         it's the highest sum of depth of left and right subtree in any node
         1. check length for left
         2. check length for right
         3. If sum of 1. and 2. is higher than the current max - update it
         4. return the higher value
         */
        findDiameterAndReturnDepth(root);
        return maxFound;
    }


    private int findDiameterAndReturnDepth(TreeNode node) {

        TreeNode left = node.left;
        TreeNode right = node.right;

        int leftDepth = 0;
        int rightDepth = 0;

        if (left != null) {
            leftDepth += 1 + findDiameterAndReturnDepth(left);
        }
        if (right != null) {
            rightDepth += 1 + findDiameterAndReturnDepth(right);
        }

        // check if I have the highest diameter
        int sum = leftDepth + rightDepth;
        if (sum > maxFound) {
            maxFound = sum;
        }

        // return greater depth
        if (leftDepth > rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }
    }
}
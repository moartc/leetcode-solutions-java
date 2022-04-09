package solutions.algorithms._617_Merge_Two_Binary_Trees;

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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return mergeNodes(root1, root2);
    }

    public TreeNode mergeNodes(TreeNode n1, TreeNode n2) {
        if (n1 != null && n2 != null) {
            TreeNode toReturn = new TreeNode(n1.val + n2.val);
            toReturn.left = mergeNodes(n1.left, n2.left);
            toReturn.right = mergeNodes(n1.right, n2.right);
            return toReturn;
        } else if (n1 == null) {
            return n2;
        } else {
            return n1;
        }
    }
}
package solutions.algorithms._235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

import commons.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (p.val == root.val || q.val == root.val) {
                return root;
            }
            if (root.val < p.val) {
                if (root.val > q.val) {
                    return root;
                } else {
                    root = root.right;
                }
            } else {
                if (root.val < q.val) {
                    return root;
                } else {
                    root = root.left;
                }
            }
        }
    }
}
package solutions.algorithms._0_999._235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

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


    /*
    Cases:
    1. node.value >= lower && node.value <= greater -> return node
    2. node.value == lower || node.value == greater -> return node.value // this is handled by 1.
    3. node.value > greater -> visit left
    4. node.value < lower -> visit right
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int left = p.val;
        int right = q.val;
        int lower = Math.min(left, right);
        int greater = Math.max(left, right);
        return visit(root, lower, greater);

    }

    public TreeNode visit(TreeNode node, int lower, int greater) {
        var nv = node.val;
        if (nv >= lower && nv <= greater) {
            return node;
        }
        if (nv > greater) {
            return visit(node.left, lower, greater);
        } else {
            return visit(node.right, lower, greater);
        }
    }

    // previous solution
    public TreeNode lowestCommonAncestor_prev(TreeNode root, TreeNode p, TreeNode q) {
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
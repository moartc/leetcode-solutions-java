package solutions.algorithms._0_999._653_Two_Sum_IV_Input_is_a_BST;

import commons.TreeNode;

import java.util.HashSet;
import java.util.Set;

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
    public boolean findTarget(TreeNode root, int k) {
        return visit(root, new HashSet<>(), k);
    }

    boolean visit(TreeNode root, Set<Integer> set, int k) {
        if (set.contains(root.val)) {
            return true;
        } else {
            set.add(k - root.val);
        }
        if (root.left != null && visit(root.left, set, k)) {
            return true;
        }
        return root.right != null && visit(root.right, set, k);
    }
}
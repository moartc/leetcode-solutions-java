package solutions.algorithms._101_Symmetric_Tree;

import commons.TreeNode;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null && right != null) {
            return areSymmetric(left, right);
        } else {
            return left == null && right == null;
        }
    }

    boolean areSymmetric(TreeNode left, TreeNode right) {
        if (left.left != null && right.right != null) {
            if (!areSymmetric(left.left, right.right)) {
                return false;
            }
        } else if (left.left != null || right.right != null) {
            return false;
        }
        if (left.right != null && right.left != null) {
            if (!areSymmetric(left.right, right.left)) {
                return false;
            }
        } else if (left.right != null || right.left != null) {
            return false;
        }
        return left.val == right.val;
    }
}
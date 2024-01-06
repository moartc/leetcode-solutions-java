package solutions.algorithms._0_999._100_Same_Tree;

import commons.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return areEquals(p, q);
    }

    boolean areEquals(TreeNode p, TreeNode q) {
        if (p.left != null && q.left != null) {
            if (!areEquals(p.left, q.left)) {
                return false;
            }
        } else if (p.left != null || q.left != null) {
            return false;
        }
        if (p.right != null && q.right != null) {
            if (!areEquals(p.right, q.right)) {
                return false;
            }
        } else if (p.right != null || q.right != null) {
            return false;
        }
        return p.val == q.val;
    }
}
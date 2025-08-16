package solutions.algorithms._0_999._100_Same_Tree;

import commons.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return areNodesIdentical(p, q);
    }

    private boolean areNodesIdentical(TreeNode p, TreeNode q) {

        if ((p == null && q != null) || (p != null && q == null)) {
            // only one of them is null
            return false;
        }

        if (p == null && q == null) {
            // both are null and that's fine
            return true;
        }
        // here I know that both are non-null

        if (p.val != q.val) {
            return false;
        }
        return areNodesIdentical(p.left, q.left) && areNodesIdentical(p.right, q.right);
    }
}
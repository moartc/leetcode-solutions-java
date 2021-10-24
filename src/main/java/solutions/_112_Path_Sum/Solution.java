package solutions._112_Path_Sum;

import commons.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return checkSum(root, 0, targetSum);
    }

    public boolean checkSum(TreeNode node, int currentSum, int targetSum) {
        currentSum += node.val;
        if (node.left == null && node.right == null) { // it is a leaf
            return currentSum == targetSum;
        } else {    // it is not a leaf
            if (node.left != null && checkSum(node.left, currentSum, targetSum)) {
                return true;
            }
            if (node.right != null) {
                return checkSum(node.right, currentSum, targetSum);
            }
        }
        return false;
    }
}
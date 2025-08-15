package solutions.algorithms._0_999._104_Maximum_Depth_of_Binary_Tree;

import commons.TreeNode;

class Solution {

    int maxFound = 0;
    public int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }
        count (root,  0);
        return maxFound;
    }

    private void count (TreeNode node, int counter) {
        counter++;
        if(maxFound < counter) {
            maxFound = counter;
        }
        TreeNode left = node.left;
        if(left != null) {
            count(left, counter);
        }
        TreeNode right = node.right;
        if(right != null) {
            count(right, counter);
        }
    }
}
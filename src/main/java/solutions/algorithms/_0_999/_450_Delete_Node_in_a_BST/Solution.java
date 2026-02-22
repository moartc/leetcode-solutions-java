package solutions.algorithms._0_999._450_Delete_Node_in_a_BST;

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
    /*
    There are 3 cases:
    Leaf node: just remove it.
    One child: replace the node with its child.
    Two children: replace with smallest in right subtree or largest in left subtree
    then delete that child
     */
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                TreeNode treeNodeToDelete = maxNode(root.left);
                root.left = deleteNode(root.left, treeNodeToDelete.val);
                root.val = treeNodeToDelete.val;
                return root;
            }
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else {
            root.right = deleteNode(root.right, key);
            return root;
        }
    }


    TreeNode maxNode(TreeNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }
}
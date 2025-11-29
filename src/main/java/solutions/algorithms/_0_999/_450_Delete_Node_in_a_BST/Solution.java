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

    update: finally solved, but it needs improvement - the solution can be very concise
     */
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        } else {
            // root is not null
            if (root.val == key) { // root to delete
                if (root.left == null && root.right == null) {
                    // no children,
                    return null;
                } else if (root.right == null) {
                    // just return left branch as root
                    return root.left;
                } else if (root.left == null) {
                    // just return right branch as root
                    return root.right;
                } else { // both children are not null
                    TreeNode tempNode = root.right;
                    int toSet = tempNode.val;
                    while (tempNode.left != null) {
                        tempNode = tempNode.left;
                        toSet = tempNode.val;
                    }
                    deleteNode(root, toSet);
                    root.val = toSet;
                }
            } else if (root.val > key) {
                // key to find is in the left subtree
                if (root.left != null && root.left.val == key) {
                    // direct left node do delete
                    if (root.left.left == null && root.left.right == null) {
                        root.left = null;
                        // left to delete has no children, set it to null
                    } else if (root.left.left == null) {
                        // right is not null
                        root.left = root.left.right;
                    } else if (root.left.right == null) {
                        // left is not null
                        root.left = root.left.left;
                    } else {
                        // left has 2 children
                        TreeNode temp = root.left.right;
                        int toSet = 0;
                        while (temp != null) {
                            toSet = temp.val;
                            temp = temp.left;
                        }
                        deleteNode(root, toSet);
                        root.left.val = toSet;
                    }
                } else {
                    //search deeper
                    deleteNode(root.left, key);
                }
            } else {
                // key to find is in the right subtree
                if (root.right != null && root.right.val == key) {
                    // direct right node do delete
                    if (root.right.left == null && root.right.right == null) {
                        // right to delete has no children, set it to null
                        root.right = null;
                    } else if (root.right.left == null) {
                        // right is not null
                        root.right = root.right.right;
                    } else if (root.right.right == null) {
                        // left is not null
                        root.right = root.right.left;
                    } else {
                        // left has 2 children
                        TreeNode temp = root.right.right;
                        int toSet = temp.val;
                        while (temp != null) {
                            toSet = temp.val;
                            temp = temp.left;
                        }
                        // first delete and then set
                        deleteNode(root.right, toSet);
                        root.right.val = toSet;
                    }
                } else {
                    //search deeper
                    deleteNode(root.right, key);
                }
            }
        }
        return root;
    }


}
package solutions.algorithms._0_999._94_Binary_Tree_Inorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    I should get the node's value after visiting the left node (if it exists)
    and before visiting the right one
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        if (root != null) {
            visit(root, values);
        }
        return values;
    }

    void visit(TreeNode node, List<Integer> values) {
        if (node.left != null) {
            visit(node.left, values);
        }
        values.add(node.val);
        if (node.right != null) {
            visit(node.right, values);
        }
    }
}
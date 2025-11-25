package solutions.algorithms._0_999._145_Binary_Tree_Postorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    I should collect the value after visiting the left and right node
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        if (root != null) {
            collect(root, values);
        }
        return values;
    }

    void collect(TreeNode node, List<Integer> values) {
        if (node.left != null) {
            collect(node.left, values);
        }
        if (node.right != null) {
            collect(node.right, values);
        }
        values.add(node.val);
    }
}
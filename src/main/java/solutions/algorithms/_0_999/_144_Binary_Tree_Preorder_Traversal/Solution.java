package solutions.algorithms._0_999._144_Binary_Tree_Preorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    collect the value right after entering the node
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        if (root != null) {
            collect(root, values);
        }
        return values;
    }

    void collect(TreeNode node, List<Integer> values) {
        values.add(node.val);
        if (node.left != null) {
            collect(node.left, values);
        }
        if (node.right != null) {
            collect(node.right, values);
        }
    }
}
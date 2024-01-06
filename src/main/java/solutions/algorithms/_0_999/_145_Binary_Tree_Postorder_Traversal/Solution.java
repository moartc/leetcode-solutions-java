package solutions.algorithms._0_999._145_Binary_Tree_Postorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        collectValues(root, result);
        return result;
    }

    void collectValues(TreeNode node, List<Integer> result) {
        if (node.left != null) {
            collectValues(node.left, result);
        }
        if (node.right != null) {
            collectValues(node.right, result);
        }
        result.add(node.val);
    }
}
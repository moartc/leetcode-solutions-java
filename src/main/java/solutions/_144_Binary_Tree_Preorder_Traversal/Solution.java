package solutions._144_Binary_Tree_Preorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        collectValues(root, result);
        return result;
    }

    void collectValues(TreeNode node, List<Integer> result) {
        result.add(node.val);
        if (node.left != null) {
            collectValues(node.left, result);
        }
        if (node.right != null) {
            collectValues(node.right, result);
        }
    }
}
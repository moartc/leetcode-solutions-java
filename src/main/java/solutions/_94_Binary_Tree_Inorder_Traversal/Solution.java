package solutions._94_Binary_Tree_Inorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
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
        result.add(node.val);
        if (node.right != null) {
            collectValues(node.right, result);
        }
    }
}
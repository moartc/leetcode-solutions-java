package solutions.algorithms._0_999._257_Binary_Tree_Paths;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
    List<String> answer;

    public List<String> binaryTreePaths(TreeNode root) {
        answer = new ArrayList<>();
        collect(root, "");
        return answer;
    }

    void collect(TreeNode node, String current) {
        if (current.isEmpty()) {
            current += node.val;
        } else {
            current += ("->" + node.val);
        }
        if (node.left == null && node.right == null) {
            answer.add(current);
        } else {
            if (node.left != null) {
                collect(node.left, current);
            }
            if (node.right != null) {
                collect(node.right, current);
            }
        }
    }
}
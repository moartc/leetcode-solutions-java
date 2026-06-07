package solutions.algorithms._2000_2999._2196_Create_Binary_Tree_From_Descriptions;

import commons.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
     1. iterate once and create all nodes -> store them in a map
     2. iterate again and make all connections
     3. find the root -> the only node that never comes as a child
     */

    public TreeNode createBinaryTree(int[][] descriptions) {

        Map<Integer, TreeNode> valToNode = new HashMap<>();
        HashSet<Integer> allNodes = new HashSet<>();
        for (int[] description : descriptions) {
            int parent = description[0];
            int child = description[1];
            allNodes.add(parent);
            if (!valToNode.containsKey(parent)) {
                TreeNode parentNode = new TreeNode(parent);
                valToNode.put(parent, parentNode);
            }
            if (!valToNode.containsKey(child)) {
                TreeNode childNode = new TreeNode(child);
                valToNode.put(child, childNode);
            }
        }

        int rootNode = -1;
        for (int[] description : descriptions) {
            int parent = description[0];
            int child = description[1];
            allNodes.remove(child);
            boolean isLeft = description[2] == 1;
            if (isLeft) {
                valToNode.get(parent).left = valToNode.get(child);
            } else {
                valToNode.get(parent).right = valToNode.get(child);
            }
            if (rootNode == -1) {
                rootNode = parent;
            }
            if (rootNode == child) {
                rootNode = parent;
            }
        }
        // there should be only one
        return valToNode.get(allNodes.iterator().next());
    }
}
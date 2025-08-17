package solutions.algorithms._0_999._230_Kth_Smallest_Element_in_a_BST;

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
    public int kthSmallest(TreeNode root, int k) {

        /*
        Notes:
        I can go the leftmost node until I reach the first null value - this node has the lowest value
        then go back, count the next node (and check if it's the k-th one), and then visit the right child

        Because the order is preserved, I can keep track of how many of the smallest values I've already visited
        and when I reach the k-th one, return its value
        For that I need a 'current state' to track both the number of already found nodes and, eventually, the k-th value

        Additional notes (short):
        when a node has no children - count it
        then count its parent
        then visit its right child, and go back upwards
         */

        State state = new State();
        visit(root, k, state);
        return state.value;
    }

    private State visit(TreeNode node, int k, State state) {

        if (node.left == null && node.right == null) {
            int foundCounter = state.currentlyFound + 1;
            if (foundCounter == k) {
                state.value = node.val;
            }
            state.currentlyFound = foundCounter;
            // and return, children are null
            return state;
        }
        // if left child is not null - visit it
        if (node.left != null) {
            visit(node.left, k, state);
            // here I should check state again - it's possible that I already have an answer
            if (state.value != -1) {
                return state;
            }
        }
        // count the current node
        int visitedBefore = state.currentlyFound;
        state.currentlyFound = visitedBefore + 1;
        if (visitedBefore + 1 == k) {
            state.value = node.val;
            return state;
        }
        // if not then visit right if non-null
        if (node.right != null) {
            return visit(node.right, k, state);
        }
        return state;
    }

    class State {
        public int currentlyFound;
        public int value = -1;
    }
}
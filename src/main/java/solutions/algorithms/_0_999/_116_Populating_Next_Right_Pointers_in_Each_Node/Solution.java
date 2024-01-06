package solutions.algorithms._0_999._116_Populating_Next_Right_Pointers_in_Each_Node;/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import commons.Node;

class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connectLeftWithRight(root);
        connectMostRightWithLeftOnTheSameLevel(root);
        return root;
    }

    private void connectLeftWithRight(Node node) {
        if (node.left != null && node.right != null) {
            node.left.next = node.right;
            connectLeftWithRight(node.left);
            connectLeftWithRight(node.right);
        }
    }

    private void connectMostRightWithLeftOnTheSameLevel(Node node) {
        if (node.left != null && node.right != null && node.left.right != null && node.right.left != null) {
            var left = node.left;
            var right = node.right;
            connectMostRightWithLeftOnTheSameLevel(left);
            connectMostRightWithLeftOnTheSameLevel(right);
            while (left.right != null && right.left != null) {
                left.right.next = right.left;
                left = left.right;
                right = right.left;
            }
        }
    }
}
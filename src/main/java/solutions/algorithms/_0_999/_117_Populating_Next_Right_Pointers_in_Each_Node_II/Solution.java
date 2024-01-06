package solutions.algorithms._0_999._117_Populating_Next_Right_Pointers_in_Each_Node_II;/*
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

import java.util.ArrayList;
import java.util.List;

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        List<List<Node>> list = new ArrayList<>();
        collectWithLevelInfo(root, 0, list);
        return root;
    }

    void collectWithLevelInfo(Node node, int level, List<List<Node>> list) {
        if(list.size() <= level) {
            list.add(new ArrayList<>());
        } else if(!list.isEmpty()){
            List<Node> nodesForLevel = list.get(level);
            Node last = nodesForLevel.get(nodesForLevel.size() - 1);
            last.next = node;
        }
        list.get(level).add(node);
        if (node.left != null) {
            collectWithLevelInfo(node.left, level + 1, list);
        }
        if (node.right != null) {
            collectWithLevelInfo(node.right, level + 1, list);
        }
    }
}
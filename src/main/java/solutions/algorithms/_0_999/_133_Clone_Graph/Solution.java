package solutions.algorithms._0_999._133_Clone_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


class Solution {
    /*
    I could use map to store the node value and list of values of its neighbours

    update: single iteration sulution
     */
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }
        Map<Integer, Node> indexToNode = new HashMap<>();
        Node nodeToReturn = clone(node, indexToNode);
        return nodeToReturn;
    }

    Node clone(Node currentNode, Map<Integer, Node> map) {
        if (map.containsKey(currentNode.val)) {
            // do nothing
            return map.get(currentNode.val);
        } else {
            Node newNode = new Node(currentNode.val);
            map.put(newNode.val, newNode);
            for (Node neighbor : currentNode.neighbors) {
                Node neighbourToAdd = null;
                if (map.containsKey(neighbor.val)) {
                    neighbourToAdd = map.get(neighbor.val);
                } else {
                    neighbourToAdd = clone(neighbor, map);
                }
                newNode.neighbors.add(neighbourToAdd);
            }
            return newNode;
        }
    }

}
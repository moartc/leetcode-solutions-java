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
     */
    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Node> listOfNodes = new HashMap<>();
        collectNodes(node, map, listOfNodes);

        // map should contain mapping info and listOfNodes all nodes
        for (Node n : listOfNodes.values()) {
            List<Integer> listOfNeighbours = map.get(n.val);
            n.neighbors = new ArrayList<>();
            for (Integer i : listOfNeighbours) {
                n.neighbors.add(listOfNodes.get(i));
            }
        }
        return listOfNodes.get(node.val);
    }

    /*
    It returns node value mapped to its neighbours values
    also it adds node to the list of nodes
     */
    void collectNodes(Node node, Map<Integer, List<Integer>> map, Map<Integer, Node> newNodes) {
        if (!map.containsKey(node.val)) {
            newNodes.put(node.val, new Node(node.val));
            List<Integer> neighbours = new ArrayList<>();
            map.put(node.val, neighbours);
            for (Node neighbor : node.neighbors) {
                neighbours.add(neighbor.val);
                collectNodes(neighbor, map, newNodes);
            }
        }
    }
}
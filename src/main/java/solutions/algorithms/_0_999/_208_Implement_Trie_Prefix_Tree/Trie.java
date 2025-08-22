package solutions.algorithms._0_999._208_Implement_Trie_Prefix_Tree;

import java.util.HashMap;
import java.util.Map;

class Trie {

    /*
    Root node has a map, char to Map of chars to other nodes
    and that's actually it

    search and starts with can be implemented as a recursion
    insert actually also

     */


    private final NodeV2 rootNodeV2;


    // keeping this one for initial implementation
    private Node rootNode;


    public Trie() {
//        rootNode = new Node();
        rootNodeV2 = new NodeV2();
    }

    public void insert(String word) {
        // I insert every char separately
        insert(word, 0, rootNodeV2);
    }

    public boolean search(String word) {
        // no recursion
        NodeV2 currentNode = rootNodeV2;

        for (char c : word.toCharArray()) {
            int idx = ((int) c) - 97;
            NodeV2 node = currentNode.map[idx];
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        return currentNode.makeWord;

    }

    public boolean startsWith(String prefix) {
        NodeV2 currentNode = rootNodeV2;
        for (char c : prefix.toCharArray()) {
            int idx = c - 97;
            NodeV2 node = currentNode.map[idx];
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        return true;

    }

    // my additional methods
    private void insert(String word, int currentIdx, NodeV2 node) {
        if (currentIdx == word.length()) {
            // everything has been added
            return;
        }
        char charToAdd = word.charAt(currentIdx);
        int idx = charToAdd - 97;
        NodeV2 nodeForChar = node.map[idx];
        if (nodeForChar != null) {
            // this means that the current character is already in the node
            // I can go forward
            if (currentIdx + 1 == word.length()) {
                // terminate here
                nodeForChar.makeWord = true;
            } else {
                insert(word, currentIdx + 1, nodeForChar);
            }
        } else {
            NodeV2 newNode = new NodeV2();
            node.map[idx] = newNode;
            if (currentIdx + 1 == word.length()) {
                // terminate here
                newNode.makeWord = true;
            } else {
                insert(word, currentIdx + 1, newNode);

            }
        }
    }

    public void insertV1(String word) {
        // I insert every char separately
        insertV1(word, 0, rootNode);
    }


    // ##########################################################################################

    // Initial implementation which beats ~50%

    public boolean searchV1(String word) {
        // no recursion
        Node currentNode = rootNode;

        for (char c : word.toCharArray()) {
            Node node = currentNode.map.get(c);
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        return currentNode.makeWord;

    }

    public boolean startsWithV1(String prefix) {
        Node currentNode = rootNode;
        for (char c : prefix.toCharArray()) {
            Node node = currentNode.map.get(c);
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        return true;

    }

    // my additional methods
    private void insertV1(String word, int currentIdx, Node node) {
        if (currentIdx == word.length()) {
            // everything has been added
            return;
        }
        char charToAdd = word.charAt(currentIdx);
        Node nodeForChar = node.map.get(charToAdd);
        if (nodeForChar != null) {
            // this means that the current character is already in the node
            // I can go forward
            if (currentIdx + 1 == word.length()) {
                // terminate here
                nodeForChar.makeWord = true;
            } else {
                insertV1(word, currentIdx + 1, nodeForChar);
            }
        } else {
            Node newNode = new Node();
            node.map.put(charToAdd, newNode);
            if (currentIdx + 1 == word.length()) {
                // terminate here
                newNode.makeWord = true;
            } else {
                insertV1(word, currentIdx + 1, newNode);

            }
        }
    }

    // pro tip from chat gpt how to improve my solution - instead of map as in my regular Node, I can use array of nodes
    // and map each character to one index
    // this beats 99%
    static class NodeV2 {
        boolean makeWord = false;
        NodeV2[] map = new NodeV2[26];
    }

    static class Node {
        boolean makeWord = false;
        Map<Character, Node> map = new HashMap<>();
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
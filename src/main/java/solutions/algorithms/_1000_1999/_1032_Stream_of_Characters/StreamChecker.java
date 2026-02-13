package solutions.algorithms._1000_1999._1032_Stream_of_Characters;

import java.util.HashSet;
import java.util.Set;

class StreamChecker {

    /*
    There are relatively many words. It doesn't make sense to store all of them and iterate through
    each one.
    I can build a Trie for this.
    Then I insert characters. For each character I try to find a matching char in the Trie.
    I keep track of the last node where I ended, and for the next char I iterate through the previously
    stored positions while also starting a new search.
    When I reach the end I return true, otherwise false.
    Also, when I retrieve a previously saved position  and cannot match the next char for the 'current' character
    I remove it from the saved positions.
    update: beats 26.78%
     */
    private Node main;
    private Set<Node> saved;

    public StreamChecker(String[] words) {
        // build my Trie here
        main = new Node();
        for (String word : words) {
            insertWord(word, main);
        }
        saved = new HashSet<>();
    }

    public boolean query(char letter) {

        boolean toReturn = false;
        Set<Node> newSaved = new HashSet<>();
        for (Node node : saved) {
            Node savedNode = node.map[letter - 'a'];
            if (savedNode != null) {
                if (savedNode.isWord) {
                    toReturn = true;
                }
                newSaved.add(savedNode);
            }
        }
        Node mainNode = main.map[letter - 'a'];
        if (mainNode != null) {
            // the first letter might create a word
            if (mainNode.isWord) {
                toReturn = true;
            }
            newSaved.add(mainNode);

        }
        saved = newSaved;
        return toReturn;
    }

    void insertWord(String w, Node main) {
        Node currentNode = main;
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            Node node = currentNode.map[c - 'a'];
            if (i == w.length() - 1) {
                // if that's the last character
                if (node != null) {
                    currentNode = node;
                    node.isWord = true;
                } else {
                    Node newNode = new Node();
                    newNode.isWord = true;
                    currentNode.map[c - 'a'] = newNode;
                }
            } else {
                if (node != null) {
                    currentNode = node;
                } else {
                    Node newNode = new Node();
                    currentNode.map[c - 'a'] = newNode;
                    currentNode = newNode;
                }
            }
        }
    }
}

class Node {
    boolean isWord = false;
    Node[] map = new Node[26];
}


/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
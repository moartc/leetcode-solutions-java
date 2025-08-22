package solutions.algorithms._0_999._211_Design_Add_and_Search_Words_Data_Structure;

class WordDictionary {


    /*
    Based on the solution created for problem 208
    search changed to recursion
     */
    private final Node rootNode;

    public WordDictionary() {
        rootNode = new Node();
    }

    public void addWord(String word) {
        insert(word, 0, rootNode);
    }

    // in 208 I used for loop, changing it to recursion for this problem
    public boolean search(String word) {
        return search(word, 0, rootNode);
    }

    private boolean search(String word, int currentIdx, Node currentNode) {

        char c = word.charAt(currentIdx);
        if (c == '.') {
            // special handling for .
            if (currentIdx + 1 == word.length()) {
                // it's the last index, so if there is any character which ends, then it matches
                for (Node node : currentNode.map) {
                    if (node != null && node.makeWord) {
                        return true;
                    }
                }
                return false;
            } else {
                for (Node node : currentNode.map) {
                    if (node != null && search(word, currentIdx + 1, node)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            // regular check
            int idx = getIdx(c);
            Node node = currentNode.map[idx];
            if (node == null) {
                return false;
            } else {
                if (currentIdx + 1 == word.length()) {
                    return node.makeWord;
                } else {
                    return search(word, currentIdx + 1, node);
                }
            }
        }
    }

    private void insert(String word, int currentIdx, Node node) {
        if (currentIdx == word.length()) {
            // everything has been added
            return;
        }
        char charToAdd = word.charAt(currentIdx);
        int idx = getIdx(charToAdd);
        Node nodeForChar = node.map[idx];
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
            Node newNode = new Node();
            node.map[idx] = newNode;
            if (currentIdx + 1 == word.length()) {
                // terminate here
                newNode.makeWord = true;
            } else {
                insert(word, currentIdx + 1, newNode);
            }
        }
    }

    /*
    there are in total 26 + 1 for dot (.)
    map lower case to 0..25
    and additionally dot (.) to 26
    lowercase ascii a-z -> 97-122
     */
    private int getIdx(char c) {
        if (c == '.') {
            return 26;
        } else {
            return c - 97;
        }

    }

    static class Node {
        boolean makeWord = false;
        Node[] map = new Node[27];
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
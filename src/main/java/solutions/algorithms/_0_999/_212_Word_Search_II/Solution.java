package solutions.algorithms._0_999._212_Word_Search_II;

import java.util.ArrayList;
import java.util.List;

/*
I am starting with DFS and then I will see.
If the performance is bad I will try to build a Trie (since that's the last problem to solve from Trie category from neetcode roadmap).

// update:
DFS caused time limit exceeded

The board is small and there are many words, so it makes sense to build a trie for words instead of the board
then I can go through my Trie, checking with the board if I can access the next node
 */
class Solution {

    private static final int[][] coords = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<String> findWords(char[][] board, String[] words) {

        Node trieRoot = buildTrie(words);

        // now do dfs
        List<String> results = new ArrayList<>();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                // any point can be a starting point, I want to start only from these which are already in root trie node map
                int idx = board[y][x] - 97;
                if (trieRoot.map[idx] != null) {
                    // start from it if it's in the board
                    dfs(board, y, x, trieRoot.map[idx], results);
                }
            }
        }
        return results;
    }

    void dfs(char[][] board, int y, int x, Node node, List<String> resultList) {

        // I will mark it as
        char currentC = board[y][x];
        if (node.word != null) {
            if (!node.alreadyAdded) {
                resultList.add(node.word);
                node.alreadyAdded = true;
            }
        }
        // mark as visited
        board[y][x] = '.';

        // visit neighbours
        for (int[] coord : coords) {
            int newY = y + coord[0];
            int newX = x + coord[1];
            if (newY < 0 || newY > board.length - 1 || newX < 0 || newX > board[0].length - 1) {
                continue;
            }
            // idx is correct but node was already visited
            char charAtNewPlace = board[newY][newX];
            if (charAtNewPlace == '.') {
                continue;
            }
            Node nodeToVisit = node.map[charAtNewPlace - 97];
            if (nodeToVisit != null) { // only if it exists in trie map
                dfs(board, newY, newX, nodeToVisit, resultList);
            }
        }
        // revert char in board
        board[y][x] = currentC;
    }

    private Node buildTrie(String[] words) {
        Node root = new Node();
        Node currentNode = root;
        for (String word : words) {
            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                int idx = c - 97;
                if (currentNode.map[idx] == null) {
                    currentNode.map[idx] = new Node();
                }
                currentNode = currentNode.map[idx];
            }
            // here I should terminate on the current node
            currentNode.word = word;
            // next iteration, set current to root
            currentNode = root;
        }
        return root;
    }

    static class Node {
        // to make it faster I track here whether the word was found and added to the result list
        public boolean alreadyAdded;
        // word in the case it's finished here
        String word = null;
        Node[] map = new Node[26];
    }
}
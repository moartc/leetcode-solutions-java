package solutions.algorithms._3000_3999._3093_Longest_Common_Suffix_Queries;

class Solution {

    TrieNode mainNode;

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        mainNode = new TrieNode();
        int shortestWord = Integer.MAX_VALUE;
        int idxOfShortestWord = -1;
        TrieNode currentNode;
        int wordIndex = 0;
        for (String s : wordsContainer) {
            if (s.length() < shortestWord) {
                shortestWord = s.length();
                idxOfShortestWord = wordIndex;
            }
            currentNode = mainNode;
            char[] charArray = s.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                char c = charArray[i];
                int cIdx = c - 'a';
                TrieNode cNode = currentNode.nodes[cIdx];
                if (cNode == null) {
                    currentNode.nodes[cIdx] = new TrieNode();
                }
                currentNode = currentNode.nodes[cIdx];
                if (currentNode.shortestThatWasHere > s.length()) {
                    currentNode.shortestThatWasHere = s.length();
                    currentNode.shortestWordIdx = wordIndex;
                }
                if (i == 0) {
                    if (currentNode.shortestWordLength > s.length()) {
                        // if that's the shortest word that ends here (so far)
                        currentNode.shortestWordLength = s.length();
                        currentNode.shortestWordIdx = wordIndex;
                    }
                }
            }
            wordIndex++;
        }

        int[] answer = new int[wordsQuery.length];
        for (int i = 0; i < wordsQuery.length; i++) {
            char[] charArray = wordsQuery[i].toCharArray();
            int wordIdx = findBest(charArray.length - 1, charArray, mainNode);
            answer[i] = wordIdx == -1 ? idxOfShortestWord : wordIdx;
        }
        return answer;
    }

    int findBest(int currIdx, char[] charArray, TrieNode node) {
        char c = charArray[currIdx];
        int idx = c - 'a';
        if (node.nodes[idx] != null) {
            if (currIdx == 0) {
                if (node.nodes[idx].shortestWordIdx != -1) {
                    return node.nodes[idx].shortestWordIdx;
                }
                return node.shortestWordIdx;
            }
            return findBest(currIdx - 1, charArray, node.nodes[idx]);
        } else {
            return node.shortestWordIdx;
        }
    }

    static class TrieNode {
        int shortestThatWasHere = Integer.MAX_VALUE;
        int shortestWordIdx = -1;
        int shortestWordLength = Integer.MAX_VALUE;
        TrieNode[] nodes = new TrieNode[26];
    }
}
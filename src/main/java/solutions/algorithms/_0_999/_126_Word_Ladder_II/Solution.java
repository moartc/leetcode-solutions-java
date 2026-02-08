package solutions.algorithms._0_999._126_Word_Ladder_II;

import java.util.*;

class Solution {

    /*
    bfs + there was a search map trick in Word Ladder, I can try it as well
    update: without trick TLE, I am adding it. Because I need index anyway to track already visited
    words I will keep in the search map indices of words instead of String values
    update: still TLE o_O
    update: new idea (from a hint) - don't store all possible paths in states
    but build a word parent tree in a map.
    then backtrack all possible paths
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Map<String, List<Integer>> searchMap = new HashMap<>();

        for (int i = 0; i < wordList.size(); i++) {
            String s = wordList.get(i);
            for (int j = 0; j < s.length(); j++) {
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(j, '*');
                String newWord = sb.toString();
                if (searchMap.containsKey(newWord)) {
                    searchMap.get(newWord).add(i);
                } else {
                    ArrayList<Integer> newList = new ArrayList<>();
                    newList.add(i);
                    searchMap.put(newWord, newList);
                }
            }
        }

        Map<String, Set<String>> parents = new HashMap<>();

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        // words taken from queue
        Set<String> visitedWords = new HashSet<>();

        while (!queue.isEmpty()) {

            int queueSizeForLevel = queue.size();

            // prevets adding the same word to the queue multiple times
            Set<String> visitedAtThisLevel = new HashSet<>();
            boolean foundEnd = false;

            for (int i = 0; i < queueSizeForLevel; i++) {

                String currentWord = queue.poll();
                for (int j = 0; j < currentWord.length(); j++) {
                    StringBuilder sb = new StringBuilder(currentWord);
                    sb.setCharAt(j, '*');
                    List<Integer> integers = searchMap.get(sb.toString());
                    if (integers != null) {
                        for (Integer wordIdx : integers) {
                            String wordAtIdx = wordList.get(wordIdx);
                            if(wordAtIdx.equals(endWord)) {
                                foundEnd = true;
                            }
                            if (!visitedWords.contains(wordAtIdx)) {
                                if (!parents.containsKey(wordAtIdx)) {
                                    parents.put(wordAtIdx, new HashSet<>());
                                }
                                parents.get(wordAtIdx).add(currentWord);
                                if (!foundEnd && !visitedAtThisLevel.contains(wordAtIdx)) {
                                    visitedAtThisLevel.add(wordAtIdx);
                                    queue.add(wordAtIdx);
                                }
                            } else if (visitedAtThisLevel.contains(wordAtIdx)) {
                                if (!parents.containsKey(wordAtIdx)) {
                                    parents.put(wordAtIdx, new HashSet<>());
                                }
                                parents.get(wordAtIdx).add(currentWord);
                            } else {
                                // there was a shorter path before (in a previous level)
                            }
                        }
                    }
                }
            }
            // add these to all visited, it means that they will be processed in the queue as parents
            visitedWords.addAll(visitedAtThisLevel);
            if (foundEnd) {
                break;
            }
        }
        // dfs part
        List<List<String>> result = new ArrayList<>();
        List<String> currentList = new ArrayList<>();
        currentList.add(endWord);
        dfs(currentList,result, parents  ,beginWord     );
        return result;
    }

    void dfs(List<String> currentList, List<List<String>> result ,Map<String, Set<String>> parents, String beginWord) {
        String lastAddedWord = currentList.get(currentList.size() - 1);

        if(parents.containsKey(lastAddedWord)) {
            for (String parent : parents.get(lastAddedWord)) {
                List<String> newSingleList = new ArrayList<>(currentList);
                newSingleList.add(parent);
                if(parent.equals(beginWord)) {
                    Collections.reverse(newSingleList);
                    result.add(newSingleList);
                } else {
                    dfs(newSingleList, result, parents, beginWord);
                }
            }
        }
    }

}
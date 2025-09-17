package solutions.algorithms._0_999._127_Word_Ladder;

import java.util.*;

class Solution {

    /*
    I could build a graph from wordList and then try to find a path from beginWord to endWord.

    Pre-check: verify that endWord is in the list

    I can then do BFS on my graph

    And below is my initial solution which beats 15% (ladderLength_v1)

    then I found the following hint:
    For example, consider a string hot and think about the strings that can be formed from it by changing a single letter.

    so I could replace every char in each word and add it to a map, mapping it to the full word.
    Then, to use this map, I can iterate over the letters in the current word and do the same replacements.
    BFS as before.

    beats 93%
     */

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Map<String, List<String>> searchMap = new HashMap<>();

        for (String word : wordList) {
            for (int i = 0; i < word.length(); i++) {
                StringBuilder newWord = new StringBuilder(word);
                newWord.setCharAt(i, '*');
                String sNewWord = newWord.toString();
                List<String> strings = searchMap.getOrDefault(sNewWord, new ArrayList<>());
                strings.add(word);
                searchMap.put(sNewWord, strings);
            }
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord, 1));

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        while (!queue.isEmpty()) {
            Pair currentPair = queue.poll();
            String currentWord = currentPair.word;
            int currentDist = currentPair.dist;
            if (currentWord.equals(endWord)) {
                return currentDist;
            }
            for (int i = 0; i < currentWord.length(); i++) {
                StringBuilder sb = new StringBuilder(currentWord);
                sb.setCharAt(i, '*');
                String string = sb.toString();
                List<String> strings = searchMap.get(string);
                if (strings != null) {
                    for (String s : strings) {
                        if (!visited.contains(s)) {
                            visited.add(s);
                            queue.add(new Pair(s, currentDist + 1));

                        }
                    }
                }
            }
        }
        return 0;
    }

    class Pair {
        String word;
        int dist;

        public Pair(String word, int dist) {
            this.word = word;
            this.dist = dist;
        }
    }
    /*
    // Initial solution
    public int ladderLength_v1(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) {
            return 0;
        }

        List<Integer>[] adjList = new ArrayList[wordList.size()];
        List<Integer> startingNodes = new ArrayList<>();

        int endWordIndex = -1;

        // map words to their indices, so I don't use Map<String, List<String>>
        for (int i = 0; i < wordList.size(); i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < wordList.size(); i++) {

            String currentWord = wordList.get(i);
            if (currentWord.equals(endWord)) {
                endWordIndex = i;
            }
            if (isOnlyOneCharDiff(beginWord, currentWord)) {
                startingNodes.add(i);
            }
            for (int j = i + 1; j < wordList.size(); j++) {
                String anotherWord = wordList.get(j);
                if (isOnlyOneCharDiff(currentWord, anotherWord)) {
                    adjList[i].add(j);
                    adjList[j].add(i);
                }
            }
        }

        int[] bestGlobal = new int[wordList.size()];
        Arrays.fill(bestGlobal, Integer.MAX_VALUE);
        int bestFound = Integer.MAX_VALUE;
        for (int startingNode : startingNodes) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{startingNode, 2});
            while (!queue.isEmpty()) {
                int[] poll = queue.poll();
                int nodeIndex = poll[0];
                int dist = poll[1];

                bestGlobal[nodeIndex] = dist;

                if (nodeIndex == endWordIndex) {
                    if (dist < bestFound) {
                        bestFound = dist;
                    }
                }
                List<Integer> stringsToVisit = adjList[nodeIndex];
                for (int toVisit : stringsToVisit) {
                    if (bestGlobal[toVisit] > dist + 1) {
                        queue.add(new int[]{toVisit, dist + 1});
                    }
                }
            }
        }
        if (bestFound == Integer.MAX_VALUE) {
            return 0;
        } else {
            return bestFound;
        }
    }


    // One of the constraints says that wordList[i].length == beginWord.length,
    // so I am not checking if 2 words have the same size

    boolean isOnlyOneCharDiff(String s1, String s2) {
        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                diffCount++;
            }
            if (diffCount > 1) {
                return false;
            }
        }
        return true;
    }
    */


}
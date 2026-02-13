package solutions.algorithms._0_999._472_Concatenated_Words;

import java.util.*;

class Solution {

    /*
    Something like Word Brake problem (LC 139)
    I will sort by length, to prevent checking if longer word forms the shorter one then some dfs
     */

    Boolean[] cache;

    public List<String> findAllConcatenatedWordsInADict(String[] words) {


        Set<String> used = new HashSet<>();
        List<String> answer = new ArrayList<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));

        for (String word : words) {

            cache = new Boolean[word.length()];
            boolean canBuild = canBuild(0, word, used, 0);
            if (canBuild) {
                answer.add(word);
            }
            used.add(word);
        }
        return answer;
    }


    boolean canBuild(int startIdx, String current, Set<String> availableWords, int ctr) {

        if (current.length() - startIdx == 0) {
            return ctr > 1;
        }
        if (cache[startIdx] != null) {
            return cache[startIdx];
        }

        // instead of iterating through all available words, check possible prefixes of the current one
        // with O(1) lookup in the set
        for (int end = startIdx + 1; end <= current.length(); end++) {
            String substring = current.substring(startIdx, end);
            if (availableWords.contains(substring)) {
                if (canBuild(end, current, availableWords, ctr + 1)) {
                    cache[startIdx] = true;
                    return true;
                }
            }
        }
        cache[startIdx] = false;
        return false;
    }
}
package solutions.algorithms._0_999._139_Word_Break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {


    Set<String> wordsWithoutSolution;

    public boolean wordBreak(String s, List<String> wordDict) {

        wordsWithoutSolution = new HashSet<>();
        return solve(s, wordDict);
    }


    // #################### below is the initial solution, above is the second approach

    /*
    notes:
    I can iterate through the input, and for each char get a substring and find a matching word,
    then recursively call the same method for the remaining part.

    update:
    I later added a cache to store indices already checked and for which I couldn't split the string.
     */

    boolean solve(String s, List<String> wordDict) {

        if (wordsWithoutSolution.contains(s)) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }
        // instead of making substring, iterate over words
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (solve(s.substring(word.length()), wordDict)) {
                    return true;
                }
            }
        }
        wordsWithoutSolution.add(s);
        return false;
    }

    Set<Integer> indicesWithoutSolution;
    public boolean wordBreakV1(String s, List<String> wordDict) {

        char[] charArray = s.toCharArray();
        indicesWithoutSolution = new HashSet<>();
        Set<String> words = new HashSet<>(wordDict);
        return solveV1(0, charArray, words);
    }


    boolean solveV1(int startIdx, char[] charArray, Set<String> wordDict) {

        if (indicesWithoutSolution.contains(startIdx)) {
            return false;
        }
        for (int i = startIdx; i < charArray.length; i++) {

            String currentSubstring = String.valueOf(charArray, startIdx, i - startIdx + 1);
            if (wordDict.contains(currentSubstring)) {
                if (i == charArray.length - 1) {
                    // last char
                    return true;
                } else {
                    boolean solve = solveV1(i + 1, charArray, wordDict);
                    if (solve) {
                        return true;
                    } else {
                        indicesWithoutSolution.add(i + 1);
                    }
                }
            }
        }
        indicesWithoutSolution.add(startIdx);
        return false;
    }
}
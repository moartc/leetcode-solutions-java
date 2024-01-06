package solutions.algorithms._0_999._139_Word_Break;

import java.util.List;

class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty() || wordDict.contains(s)) {
            return true;
        }
        for (String word : wordDict) {
            boolean foundSolution = true;
            if (s.contains(word)) {
                for (String newString : s.split(word)) {
                    if (!wordBreak(newString, wordDict)) {
                        foundSolution = false;
                        break;
                    }
                }
            } else {
                foundSolution = false;
            }
            if (foundSolution) {
                return true;
            }
        }
        return false;
    }
}
package solutions.algorithms._0_999._140_Word_Break_II;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    I could reverse the order a bit and instead of iterating over the string 's' iterate
    through over wordDict and check whether the current (sub)string starts with a given word.
    if it does, I add it to some array or append it to a StringBuilder and then process
    the remaining part of the string the same way.
     */
    public List<String> wordBreak(String s, List<String> wordDict) {

        List<String> res = new ArrayList<>();
        breakString(s, 0, wordDict, new StringBuilder(), res);
        return res;
    }

    void breakString(String s, int start, List<String> wordDict, StringBuilder currentSentence, List<String> res) {

        if (start == s.length()) {
            String r = new StringBuilder(currentSentence).deleteCharAt(currentSentence.length() - 1).toString();
            res.add(r);
        } else {
            for (String word : wordDict) {
                if (s.startsWith(word, start)) {
                    currentSentence.append(word);
                    currentSentence.append(" ");
                    breakString(s, start + word.length(), wordDict, currentSentence, res);
                    currentSentence.delete(currentSentence.length() - 1, currentSentence.length());
                    currentSentence.delete(currentSentence.length() - word.length(), currentSentence.length());
                }
            }
        }
    }
}
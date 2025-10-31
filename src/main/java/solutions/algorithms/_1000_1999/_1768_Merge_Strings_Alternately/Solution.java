package solutions.algorithms._1000_1999._1768_Merge_Strings_Alternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        if (i < word1.length()) {
            // still something in word1
            sb.append(word1, i, word1.length());
        }
        if (j < word2.length()) {
            // still something in word2
            sb.append(word2, j, word2.length());
        }
        return sb.toString();
    }
}
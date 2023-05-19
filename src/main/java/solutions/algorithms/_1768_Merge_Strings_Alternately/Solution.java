package solutions.algorithms._1768_Merge_Strings_Alternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < word1.length() && idx2 < word2.length()) {
            sb.append(word1.charAt(idx1));
            sb.append(word2.charAt(idx2));
            idx1++;
            idx2++;
        }
        if(idx1 == word1.length()) {
            sb.append(word2.substring(idx2));
        }
        if(idx2 == word2.length()) {
            sb.append(word1.substring(idx1));
        }
        return sb.toString();
    }
}
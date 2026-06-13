package solutions.algorithms._3000_3999._3838_Weighted_Word_Mapping;

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {


        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            int weightSum = 0;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                weightSum += weights[idx];
            }
            int modWeight = weightSum % 26;
            char c = (char) ('z' - modWeight);
            sb.append(c);
        }
        return sb.toString();
    }
}
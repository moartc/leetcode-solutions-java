package solutions.algorithms._1000_1999._1111_Maximum_Nesting_Depth_of_Two_Valid_Parentheses_Strings;

class Solution {

    public int[] maxDepthAfterSplit(String seq) {


        // count max depth and max / 2 as a desired
        // then iterate and mark 0, these parenthesis that are up to the half, and 1 above
        int max = 0;
        char[] chars = seq.toCharArray();
        int depth = 0;
        for (int i = 0; i < chars.length; i++) {
            int curr = chars[i];
            if (curr == '(') {
                depth++;
            } else {
                depth--;
            }
            max = Math.max(depth, max);
        }
        int half = max / 2;
        depth = 0;
        int[] answer = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int curr = chars[i];
            if (curr == '(') {
                depth++;
                if (depth <= half) {
                    answer[i] = 0;
                } else {
                    answer[i] = 1;
                }
            } else {
                depth--;
                if (depth + 1 <= half) {
                    answer[i] = 0;
                } else {
                    answer[i] = 1;
                }
            }
        }
        return answer;
    }
}
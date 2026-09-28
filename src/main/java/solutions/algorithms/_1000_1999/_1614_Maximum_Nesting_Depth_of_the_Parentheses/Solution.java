package solutions.algorithms._1000_1999._1614_Maximum_Nesting_Depth_of_the_Parentheses;

class Solution {
    public int maxDepth(String s) {

        int depth = 0;
        int maxFound = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                depth++;
                maxFound = Math.max(maxFound, depth);
            } else if (c == ')') {
                depth--;
            } else {
                // do nothing
            }
        }

        return maxFound;
    }
}
package solutions.algorithms._0_999._796_Rotate_String;

class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }
        String ss = s + s;
        return ss.contains(goal);
    }
}
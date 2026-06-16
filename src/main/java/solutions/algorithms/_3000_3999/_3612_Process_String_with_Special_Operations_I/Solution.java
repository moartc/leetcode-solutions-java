package solutions.algorithms._3000_3999._3612_Process_String_with_Special_Operations_I;

class Solution {
    public String processStr(String s) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else if (c == '*') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (c == '#') {
                sb.append(sb);
            } else if (c == '%') {
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
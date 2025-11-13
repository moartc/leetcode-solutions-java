package solutions.algorithms._0_999._71_Simplify_Path;

import java.util.LinkedList;

class Solution {

    /*
    I can split by '/' and then recreate by adding segments to a list
     */
    public String simplifyPath(String path) {

        LinkedList<String> listOfSegments = new LinkedList<>();
        // path always starts with '/'
        String[] split = path.split("/", -1);
        for (String s : split) {
            if (s.isEmpty() || s.equals(".")) {
                // continue
            } else if (s.equals("..")) {
                if (!listOfSegments.isEmpty()) {
                    listOfSegments.removeLast();
                }
            } else {
                listOfSegments.add(s);
            }
        }
        int numb = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        for (String s : listOfSegments) {
            sb.append(s);
            sb.append("/");
            numb++;
        }
        if (numb > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
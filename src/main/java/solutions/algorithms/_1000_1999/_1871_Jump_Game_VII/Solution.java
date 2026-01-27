package solutions.algorithms._1000_1999._1871_Jump_Game_VII;

import java.util.LinkedList;

class Solution {

    /*

    Trying a bfs before watching neet code solution
    LTE
    my solution based on neet code bfs trick with farthest variable
     */
    public boolean canReach(String s, int minJump, int maxJump) {

        if (s.charAt(0) != '0' || s.charAt(s.length() - 1) != '0') {
            return false;
        }

        LinkedList<Integer> toVisit = new LinkedList<>();
        toVisit.add(0);
        int farthest = 0;
        while (!toVisit.isEmpty()) {
            int current = toVisit.poll();
            int start = Math.max(current + minJump, farthest + 1);
            for (int j = start; j <= Math.min(current + maxJump, s.length() - 1); j++) {
                if (s.charAt(j) == '0') {
                    toVisit.add(j);
                    if (j == s.length() - 1) {
                        return true;
                    }
                }
            }
            farthest = current + maxJump;
        }
        return false;
    }

}
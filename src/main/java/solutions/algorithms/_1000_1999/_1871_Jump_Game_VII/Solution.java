package solutions.algorithms._1000_1999._1871_Jump_Game_VII;

import java.util.LinkedList;

class Solution {

    /*

    Trying a bfs before watching neet code solution
    LTE
    my solution based on neet code bfs trick with the farthest variable
     */
    public boolean canReach(String s, int minJump, int maxJump) {

        if (s.charAt(0) != '0' || s.charAt(s.length() - 1) != '0') {
            return false;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);
        int farhest = 0;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            int max = Math.min(poll + maxJump, s.length() - 1);
            for (int i = Math.max(poll + minJump, farhest + 1); i <= max; i++) {
                if (s.charAt(i) == '0') {
                    if (s.length() - 1 == i) {
                        return true;
                    }
                    queue.add(i);
                }
            }
            // it's important to have this here. I don't add '1's so updating it with the poll value would result
            // in assigning not the real farthest value, but only a '0' one
            farhest = max;
        }
        return false;
    }
}
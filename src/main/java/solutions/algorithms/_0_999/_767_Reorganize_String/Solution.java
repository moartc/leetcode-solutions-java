package solutions.algorithms._0_999._767_Reorganize_String;

import java.util.*;

class Solution {
    /*
    Sorting doesn't help, because then I can have something like this:
    abbbbbcd
    if I pick one from the beginning and then from the end (that was my initial idea), I end up with a substring of the same  characters.

    I could build a frequency map, for the string "aaaaaabbcde" I have:
    aaaaaa
    bb
    c
    d
    and I can build:  a b a b a c a d a e a

    observation: when I start from the most frequent char, it's impossible to "lock myself" with the 2nd most frequent one.
    Even if there are only 2 different characters, I am safe

    The only question is how to arrange the characters. I think I can add all of them to the same queue.
    Then when constructing the answer, poll the most frequent, use one, then poll the 2nd one, use it
    and add back the first one (as well as the 2nd one) if its occurrence is > 0

     */
    // todo refactoring - it beats ~26%
    public String reorganizeString(String s) {

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>();
        entries.addAll(freq.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());


        PriorityQueue<Pair> queue = new PriorityQueue<>((o1, o2) -> o2.oc - o1.oc);
        for (Map.Entry<Character, Integer> entry : entries) {
            Pair p = new Pair(entry.getKey(), entry.getValue());
            queue.add(p);
        }

        // now I can construct the answer, if the value I take from the 2nd string is the same as the last value - return empty

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Pair first = queue.poll();
            sb.append(first.c);
            Pair second = null;
            if (!queue.isEmpty()) {
                second = queue.poll();
                if (first.c == second.c) {
                    return "";
                }
                sb.append(second.c);
            } else {
                // 2nd queue is empty
                if (first.oc > 1) {
                    return "";
                }
            }

            if (first.oc > 1) {
                queue.add(new Pair(first.c, first.oc - 1));
            }
            if (second != null && second.oc > 1) {
                queue.add(new Pair(second.c, second.oc - 1));
            }
        }

        return sb.toString();
    }

    class Pair {
        public char c;
        public int oc;

        public Pair(char c, int oc) {
            this.c = c;
            this.oc = oc;
        }
    }
}

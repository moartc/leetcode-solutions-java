package solutions.algorithms._3000_3999._3666_Minimum_Operations_to_Equalize_Binary_String;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class Solution {

    /*
    some random notes:
    - I need k zeros -> then I can swap them to '1'
    - or (even better) 0 number of zeros = only '1' (nothing to do)
    - it doesn't matter where the numbers are, only the count matters
    - if I have x zeros and y ones I can do:
        if x >= k -> set k ones (and remove k zeros)
        if x < k -> set x ones and k-x zeros
    In general I can set i=0..(min(x,k)) ones + (k-i) zeros
    I could generate all possible states starting from the beginning and search for the one with x==0
    The state can be represented as a single int - sicne I know k, I can calculate both the numb of zeros and ones from that one value.

    TLE with my BFS. I'm checking hints.

     */
    public int minOperations(String s, int k) {

        int zeroCtr = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeroCtr++;
            }
        }
        if (zeroCtr == 0) {
            return 0;
        }

        LinkedList<Integer> list = new LinkedList<>();
        list.add(zeroCtr);
        List<TreeSet<Integer>> unvisited = new ArrayList<>();
        unvisited.add(new TreeSet<>());
        unvisited.add(new TreeSet<>());
        for (int i = 0; i < s.length(); i++) {
            unvisited.get(i % 2).add(i);
        }
        unvisited.get(zeroCtr % 2).remove(zeroCtr);

        int ctr = 0;
        while (!list.isEmpty()) {

            int numberOfElementsInThisStep = list.size();
            for (int i = 0; i < numberOfElementsInThisStep; i++) {
                // 0000111
                Integer currentValue = list.poll();
                if (currentValue == 0) {
                    return ctr;
                }
                int minZeros = Math.max(k - s.length() + currentValue, 0);
                int maxZeros = Math.min(k, currentValue);
                int l = currentValue + k - 2 * maxZeros;
                int r = currentValue + k - 2 * minZeros;
                TreeSet<Integer> candidates = unvisited.get(l % 2);
                for (Integer next = candidates.ceiling(l); next != null && next <= r; next = candidates.ceiling(l)) {
                    candidates.remove(next);
                    list.add(next);
                }
            }
            ctr++;
        }
        return -1;
    }
}
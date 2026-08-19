package solutions.algorithms._1000_1999._1386_Cinema_Seat_Allocation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> reserved = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int place = seat[1];
            Set<Integer> rowSet = reserved.getOrDefault(row, new HashSet<>());
            rowSet.add(place);
            reserved.put(row, rowSet);
        }
        int ctr = 0;
        // instead of iterating for (int i = 1; i <= n; i++)
        // I will go through rows and then add the rest
        int doubles = (n - reserved.size()) * 2;
        for (Map.Entry<Integer, Set<Integer>> entry : reserved.entrySet()) {
            Set<Integer> rowTaken = entry.getValue();
            if (!rowTaken.contains(2)
                    && !rowTaken.contains(3)
                    && !rowTaken.contains(4)
                    && !rowTaken.contains(5)
                    && !rowTaken.contains(6)
                    && !rowTaken.contains(7)
                    && !rowTaken.contains(8)
                    && !rowTaken.contains(9)
            ) {
                ctr += 2;
            } else if (
                    (!rowTaken.contains(2)
                            && !rowTaken.contains(3)
                            && !rowTaken.contains(4)
                            && !rowTaken.contains(5))
                            || (!rowTaken.contains(4)
                            && !rowTaken.contains(5)
                            && !rowTaken.contains(6)
                            && !rowTaken.contains(7))
                            || (!rowTaken.contains(6)
                            && !rowTaken.contains(7)
                            && !rowTaken.contains(8)
                            && !rowTaken.contains(9))
            ) {
                ctr++;
            }
        }
        return ctr + doubles;
    }
}
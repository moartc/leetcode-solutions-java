package solutions.algorithms._1000_1999._1536_Minimum_Swaps_to_Arrange_a_Binary_Grid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    /*
    calc the number of zeros from right to left or first non zero digit, store these numbers in a list.
    Sort them so that the first has at least n-1 zeros, the next n-2 ..., and the last one 0 zeros
    update: terrible performance
     */
    public int minSwaps(int[][] grid) {

        List<Integer> list = new ArrayList<>();

        ex:
        for (int y = 0; y < grid.length; y++) {
            int counter = 0;
            for (int x = grid.length - 1; x >= 0; x--) {
                if (grid[y][x] == 0) {
                    counter++;
                } else {
                    list.add(counter);
                    continue ex;
                }
            }
            list.add(counter);
        }

        ArrayList<Integer> toSort = new ArrayList<>(list);
        Collections.sort(toSort);
        int n = list.size();
        for (int i = toSort.size() - 1; i >= 0; i--) {
            if (toSort.get(i) < i) {
                return -1;
            }
        }

        // 1 2 4 4 5
        // 4 3 2 1 0
        int swap = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) < n - 1 - i) {
                swap += move(i, list);
            }
        }
        return swap;
    }

    int move(int idx, List<Integer> list) {
        int swaps = 0;
        int lowestValue = list.size() - 1 - idx;
        int indexToMove = -1;
        for (int i = idx + 1; i < list.size(); i++) {
            if (list.get(i) >= lowestValue) {
                indexToMove = i;
                break;
            }
        }
        while (indexToMove > idx) {
            swaps++;
            swap(indexToMove - 1, indexToMove, list);
            indexToMove--;
        }
        return swaps;
    }

    void swap(int index1, int index2, List<Integer> list) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
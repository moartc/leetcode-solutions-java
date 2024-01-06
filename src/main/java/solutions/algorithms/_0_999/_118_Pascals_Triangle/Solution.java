package solutions.algorithms._0_999._118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>(numRows);
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    newRow.add(1);
                } else {
                    newRow.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(newRow);
        }
        return result;
    }
}
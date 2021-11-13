package solutions.algorithms._119_Pascals_Triangle_II;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> results = new ArrayList<>();
        results.add(1);
        long value = 1;
        for (int i = 0; i < rowIndex; i++) {
            value = (value * (rowIndex - i)) / (i + 1);
            results.add((int) value);
        }
        return results;
    }
}
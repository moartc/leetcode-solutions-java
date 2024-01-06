package solutions.algorithms._0_999._384_Shuffle_an_Array;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._384_Shuffle_an_Array.Solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
There are no assertions in this file.
It was created only to check what combinations with what frequency have are generated.
 */
class SolutionTest {

    private Solution solution;

    @Test
    void shuffleTest() {

        solution = new Solution(new int[]{-6, 10, 184});
        int[] shuffled;

        Map<List<Integer>, Integer> counter = new HashMap<>();
        for (int i = 0; i < 600000; i++) {
            shuffled = solution.shuffle();
            var shuffledAsList = Arrays.stream(shuffled).boxed().toList();
            Integer integer = counter.get(shuffledAsList);
            if (integer == null) {
                counter.put(shuffledAsList, 1);
            } else {
                counter.put(shuffledAsList, integer + 1);
            }
        }

        for (Map.Entry<List<Integer>, Integer> entry : counter.entrySet()) {
            System.out.println("arr: " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
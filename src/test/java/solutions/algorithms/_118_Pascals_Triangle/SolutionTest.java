package solutions.algorithms._118_Pascals_Triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void generateTest1() {
        int numRows = 5;
        List<List<Integer>> expected = new ArrayList<>(Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1)));
        List<List<Integer>> actual = solution.generate(numRows);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void generateTest2() {
        int numRows = 1;
        List<List<Integer>> expected = new ArrayList<>(Arrays.asList(Arrays.asList(1)));
        List<List<Integer>> actual = solution.generate(numRows);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void generateTest3() {
        int numRows = 0;
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = solution.generate(numRows);
        Assertions.assertIterableEquals(expected, actual);
    }
}
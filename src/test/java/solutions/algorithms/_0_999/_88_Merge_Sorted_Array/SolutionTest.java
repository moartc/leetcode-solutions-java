package solutions.algorithms._0_999._88_Merge_Sorted_Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void mergeTest1() {
        int[] inputNums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] inputNums2 = new int[]{2, 5, 6};
        int n = 3;
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        solution.merge(inputNums1, m, inputNums2, n);
        Assertions.assertArrayEquals(expected, inputNums1);
    }

    @Test
    void mergeTest2() {
        int[] inputNums1 = new int[]{1};
        int m = 1;
        int[] inputNums2 = new int[]{};
        int n = 0;
        int[] expected = new int[]{1};
        solution.merge(inputNums1, m, inputNums2, n);
        Assertions.assertArrayEquals(expected, inputNums1);
    }

    @Test
    void mergeTest3() {
        int[] inputNums1 = new int[]{0};
        int m = 0;
        int[] inputNums2 = new int[]{1};
        int n = 1;
        int[] expected = new int[]{1};
        solution.merge(inputNums1, m, inputNums2, n);
        Assertions.assertArrayEquals(expected, inputNums1);
    }
}
package solutions.algorithms._167_Two_Sum_II_Input_Array_Is_Sorted;

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
    void twoSumTest1() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{1, 2};
        int[] actual = solution.twoSum(numbers, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest2() {
        int[] numbers = new int[]{2, 3, 4};
        int target = 6;
        int[] expected = new int[]{1, 3};
        int[] actual = solution.twoSum(numbers, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest3() {
        int[] numbers = new int[]{-1, 0};
        int target = -1;
        int[] expected = new int[]{1, 2};
        int[] actual = solution.twoSum(numbers, target);
        Assertions.assertArrayEquals(expected, actual);
    }
}
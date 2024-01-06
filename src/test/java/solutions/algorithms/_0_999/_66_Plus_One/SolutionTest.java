package solutions.algorithms._0_999._66_Plus_One;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._66_Plus_One.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void plusOneTest1() {

        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        int[] actual = solution.plusOne(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void plusOneTest2() {

        int[] input = new int[]{4, 3, 2, 1};
        int[] expected = new int[]{4, 3, 2, 2};
        int[] actual = solution.plusOne(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void plusOneTest3() {

        int[] input = new int[]{0};
        int[] expected = new int[]{1};
        int[] actual = solution.plusOne(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void plusOneTest4() {

        int[] input = new int[]{9};
        int[] expected = new int[]{1, 0};
        int[] actual = solution.plusOne(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void plusOneTest5() {

        int[] input = new int[]{9, 9};
        int[] expected = new int[]{1, 0, 0};
        int[] actual = solution.plusOne(input);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void plusOneTest6() {

        int[] input = new int[]{1, 9};
        int[] expected = new int[]{2, 0};
        int[] actual = solution.plusOne(input);
        Assertions.assertArrayEquals(expected, actual);
    }
}
package solutions.algorithms._977_Squares_of_a_Sorted_Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortedSquaresTest1() {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquaresTest2() {
        int[] input = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquaresTest3() {
        int[] input = new int[]{0, 3, 10};
        int[] expected = new int[]{0, 9, 100};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquaresTest4() {
        int[] input = new int[]{-1, 3, 10};
        int[] expected = new int[]{1, 9, 100};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquaresTest5() {
        int[] input = new int[]{-10, -4, -1};
        int[] expected = new int[]{1, 16, 100};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquaresTest6() {
        int[] input = new int[]{-4, -1, 3};
        int[] expected = new int[]{1, 9, 16};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquaresTest7() {
        int[] input = new int[]{-4};
        int[] expected = new int[]{16};
        int[] actual = solution.sortedSquares(input);
        assertArrayEquals(expected, actual);
    }
}
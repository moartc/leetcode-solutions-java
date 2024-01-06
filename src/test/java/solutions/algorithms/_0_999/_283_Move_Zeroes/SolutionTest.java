package solutions.algorithms._0_999._283_Move_Zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void moveZeroesTest1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesTest2() {
        int[] nums = new int[]{0};
        int[] expected = new int[]{0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesTest3() {
        int[] nums = new int[]{0, 0, 1};
        int[] expected = new int[]{1, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}
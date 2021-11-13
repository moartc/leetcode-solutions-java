package solutions.algorithms._1_Two_Sum;

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

        int[] nums = new int[]{2, 7, 11, 5};
        int target = 9;
        int[] expected = new int[]{0, 1};
        int[] actual = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest2() {

        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] expected = new int[]{1, 2};
        int[] actual = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest3() {

        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] expected = new int[]{0, 1};
        int[] actual = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest4() {

        int[] nums = new int[]{2, 5, 5, 11};
        int target = 10;
        int[] expected = new int[]{1, 2};
        int[] actual = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }
}
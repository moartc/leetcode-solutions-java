package solutions.algorithms._0_999._189_Rotate_Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotateTest1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest2() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        int[] expected = new int[]{3, 99, -1, -100};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest3() {
        int[] nums = new int[]{1, 2};
        int k = 1;
        int[] expected = new int[]{2, 1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest5() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 3;
        int[] expected = new int[]{-100, 3, 99, -1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest6() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int k = 3;
        int[] expected = new int[]{4, 5, 6, 1, 2, 3};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest7() {
        int[] nums = new int[]{-1, -100, 3};
        int k = 2;
        int[] expected = new int[]{-100, 3, -1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest8() {
        int[] nums = new int[]{1};
        int k = 0;
        int[] expected = new int[]{1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest9() {
        int[] nums = new int[]{1};
        int k = 1;
        int[] expected = new int[]{1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest10() {
        int[] nums = new int[]{1, 2};
        int k = 2;
        int[] expected = new int[]{1, 2};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest11() {
        int[] nums = new int[]{1, 2, 3};
        int k = 1;
        int[] expected = new int[]{3, 1, 2};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest12() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = new int[]{4, 5, 1, 2, 3};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest13() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int k = 2;
        int[] expected = new int[]{5, 6, 1, 2, 3, 4};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest14() {
        int[] nums = new int[]{-1};
        int k = 2;
        int[] expected = new int[]{-1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest15() {
        int[] nums = new int[]{1, 2};
        int k = 3;
        int[] expected = new int[]{2, 1};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest16() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53};
        int k = 82;
        int[] expected = new int[]{25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest17() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 3;
        int[] expected = new int[]{3, 4, 5, 1, 2};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest18() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 4;
        int[] expected = new int[]{4, 5, 6, 7, 1, 2, 3};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest19() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = new int[]{4, 5, 1, 2, 3};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }

    @Test
    void rotateTest20() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int k = 6;
        int[] expected = new int[]{6, 7, 8, 9, 10, 11, 1, 2, 3, 4, 5};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }
    @Test
    void rotateTest21() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int k = 4;
        int[] expected = new int[]{8, 9, 10, 11, 1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(expected, nums);
    }
}



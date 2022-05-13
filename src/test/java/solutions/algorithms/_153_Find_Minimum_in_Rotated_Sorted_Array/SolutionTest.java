package solutions.algorithms._153_Find_Minimum_in_Rotated_Sorted_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchTest1() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest2() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(0);
    }

    @Test
    void searchTest3() {
        int[] nums = new int[]{11, 13, 15, 17};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(11);
    }

    @Test
    void searchTest4() {
        int[] nums = new int[]{1};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest5() {
        int[] nums = new int[]{1, 2};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest6() {
        int[] nums = new int[]{7, 8, 9, 10, 1, 4, 5, 6};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest7() {
        int[] nums = new int[]{5, 1, 3};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest8() {
        int[] nums = new int[]{5, 1, 2, 3, 4};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest9() {
        int[] nums = new int[]{5, 6, 1, 2, 3};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(1);
    }

    @Test
    void searchTest10() {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(0);
    }

    @Test
    void searchTest11() {
        int[] nums = new int[]{1, 2, 3, 4, 0};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(0);
    }

    @Test
    void searchTest12() {
        int[] nums = new int[]{28, 29, 30, 31, 32, 33, 34, 35, 36, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        Assertions.assertThat(solution.findMin(nums)).isEqualTo(0);
    }
}
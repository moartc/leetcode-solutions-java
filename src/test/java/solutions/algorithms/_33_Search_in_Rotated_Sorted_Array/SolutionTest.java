package solutions.algorithms._33_Search_in_Rotated_Sorted_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchTest1() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(4);
    }

    @Test
    void searchTest2() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(-1);
    }

    @Test
    void searchTest3() {
        int[] nums = new int[]{1};
        int target = 0;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(-1);
    }

    @Test
    void searchTest4() {
        int[] nums = new int[]{1, 2};
        int target = 3;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(-1);
    }

    @Test
    void searchTest5() {
        int[] nums = new int[]{1, 2};
        int target = 1;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(0);
    }


    @Test
    void searchTest6() {
        int[] nums = new int[]{1, 2};
        int target = 2;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(1);
    }

    @Test
    void searchTest7() {
        int[] nums = new int[]{7, 8, 9, 1, 4, 5, 6};
        int target = 1;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(3);
    }

    @Test
    void searchTest8() {
        int[] nums = new int[]{7, 8, 9, 10, 1, 4, 5, 6};
        int target = 10;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(3);
    }

    @Test
    void searchTest9() {
        int[] nums = new int[]{7, 8, 9, 10, 1, 4, 5, 6};
        int target = 6;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(7);
    }

    @Test
    void searchTest10() {
        int[] nums = new int[]{7, 8, 9, 10, 1, 4, 5, 6};
        int target = 7;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(0);
    }

    @Test
    void searchTest11() {
        int[] nums = new int[]{5, 1, 3};
        int target = 5;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(0);
    }

    @Test
    void searchTest12() {
        int[] nums = new int[]{5, 1, 2, 3, 4};
        int target = 1;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(1);
    }

    @Test
    void searchTest13() {
        int[] nums = new int[]{5, 6, 1, 2, 3};
        int target = 6;
        Assertions.assertThat(solution.search(nums, target)).isEqualTo(1);
    }
}
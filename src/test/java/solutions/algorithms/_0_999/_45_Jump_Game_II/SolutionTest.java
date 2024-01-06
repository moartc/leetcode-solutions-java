package solutions.algorithms._0_999._45_Jump_Game_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._45_Jump_Game_II.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void jumpTest1() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void jumpTest2() {
        int[] nums = new int[]{2, 3, 0, 1, 4};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void jumpTest3() {
        int[] nums = new int[]{2};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void jumpTest4() {
        int[] nums = new int[]{0};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void jumpTest5() {
        int[] nums = new int[]{2, 1};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void jumpTest6() {
        int[] nums = new int[]{5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    void jumpTest7() {
        int[] nums = new int[]{5, 8, 1, 8, 9, 8, 7, 1, 7, 5, 8, 6, 5, 4, 7, 3, 9, 9, 0, 6, 6, 3, 4, 8, 0, 5, 8, 9, 5, 3, 7, 2, 1, 8, 2, 3, 8, 9, 4, 7, 6, 2, 5, 2, 8, 2, 7, 9, 3, 7, 6, 9, 2, 0, 8, 2, 7, 8, 4, 4, 1, 1, 6, 4, 1, 0, 7, 2, 0, 3, 9, 8, 7, 7, 0, 6, 9, 9, 7, 3, 6, 3, 4, 8, 6, 4, 3, 3, 2, 7, 8, 5, 8, 6, 0};
        int actual = solution.jump(nums);
        Assertions.assertThat(actual).isEqualTo(16);
    }
}
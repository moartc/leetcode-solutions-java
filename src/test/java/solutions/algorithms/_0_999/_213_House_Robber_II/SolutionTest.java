package solutions.algorithms._0_999._213_House_Robber_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._213_House_Robber_II.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void robTest1() {
        int[] nums = new int[]{2, 3, 2};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void robTest2() {
        int[] nums = new int[]{1, 2, 3, 1};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void robTest3() {
        int[] nums = new int[]{1, 2, 3};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void robTest4() {
        int[] nums = new int[]{5, 1, 2, 7, 4};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(12);
    }

    @Test
    void robTest5() {
        int[] nums = new int[]{200, 3, 140, 20, 10};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(340);
    }

    @Test
    void robTest6() {
        int[] nums = new int[]{114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(4077);
    }

    @Test
    void robTest7() {
        int[] nums = new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(7102);
    }

    @Test
    void robTest8() {
        int[] nums = new int[]{1, 1, 3, 6, 7, 10, 7, 1, 8, 5, 9, 1, 4, 4, 3};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(41);
    }

    @Test
    void robTest9() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(16);
    }

    @Test
    void robTest10() {
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int actual = solution.rob(nums);
        Assertions.assertThat(actual).isEqualTo(0);
    }
}
package solutions.algorithms._0_999._198_House_Robber;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void robTest1() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(4);
    }

    @Test
    void robTest2() {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(12);
    }

    @Test
    void robTest3() {
        int[] nums = new int[]{10, 1, 1, 10, 1};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(20);
    }

    @Test
    void robTest4() {
        int[] nums = new int[]{10, 1, 1, 10, 1, 1};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(21);
    }

    @Test
    void robTest5() {
        int[] nums = new int[]{1, 2};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(2);
    }

    @Test
    void robTest6() {
        int[] nums = new int[]{1};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(1);
    }

    @Test
    void robTest7() {
        int[] nums = new int[]{4, 1, 2, 7, 5, 3, 1};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(14);
    }

    @Test
    void robTest8() {
        int[] nums = new int[]{114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(4173);
    }

    @Test
    void robTest9() {
        int[] nums = new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124};
        Assertions.assertThat(solution.rob(nums)).isEqualTo(7102);
    }
}

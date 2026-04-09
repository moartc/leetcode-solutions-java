package solutions.algorithms._1000_1999._1437_Check_If_All_1s_Are_at_Least_LengthK_Places_Away;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void kLengthApart1() {
        int[] nums = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
        boolean answer = solution.kLengthApart(nums, k);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void kLengthApart2() {
        int[] nums = new int[]{1, 0, 0, 1, 0, 1};
        int k = 2;
        boolean answer = solution.kLengthApart(nums, k);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void kLengthApart3() {
        int[] nums = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int k = 32;
        boolean answer = solution.kLengthApart(nums, k);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void kLengthApart4() {
        int[] nums = new int[]{0, 1, 0, 1};
        int k = 1;
        boolean answer = solution.kLengthApart(nums, k);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void kLengthApart5() {
        int[] nums = new int[]{0, 0, 0, 1, 0, 1};
        int k = 2;
        boolean answer = solution.kLengthApart(nums, k);
        Assertions.assertThat(answer).isFalse();
    }


}
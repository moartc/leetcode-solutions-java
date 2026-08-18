package solutions.algorithms._3000_3999._3471_Find_the_Largest_Almost_Missing_Integer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestInteger1() {
        int[] nums = new int[]{3, 9, 2, 1, 7};
        int k = 3;
        int answer = solution.largestInteger(nums, k);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void largestInteger2() {
        int[] nums = new int[]{3, 9, 7, 2, 1, 7};
        int k = 4;
        int answer = solution.largestInteger(nums, k);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void largestInteger3() {
        int[] nums = new int[]{0, 0};
        int k = 1;
        int answer = solution.largestInteger(nums, k);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void largestInteger4() {
        int[] nums = new int[]{0, 0};
        int k = 2;
        int answer = solution.largestInteger(nums, k);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
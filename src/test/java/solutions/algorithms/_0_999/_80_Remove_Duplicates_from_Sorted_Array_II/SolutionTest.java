package solutions.algorithms._0_999._80_Remove_Duplicates_from_Sorted_Array_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeDuplicates1() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int answer = solution.removeDuplicates(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int answer = solution.removeDuplicates(nums);
        Assertions.assertThat(answer).isEqualTo(7);
    }
}
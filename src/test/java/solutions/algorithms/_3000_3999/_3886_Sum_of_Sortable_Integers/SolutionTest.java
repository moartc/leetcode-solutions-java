package solutions.algorithms._3000_3999._3886_Sum_of_Sortable_Integers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortableIntegers1() {
        int[] nums = new int[]{3, 1, 2};
        int answer = solution.sortableIntegers(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void sortableIntegers2() {
        int[] nums = new int[]{7, 6, 5};
        int answer = solution.sortableIntegers(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void sortableIntegers3() {
        int[] nums = new int[]{5, 8};
        int answer = solution.sortableIntegers(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}
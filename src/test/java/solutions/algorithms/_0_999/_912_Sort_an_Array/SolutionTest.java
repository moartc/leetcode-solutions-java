package solutions.algorithms._0_999._912_Sort_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortArray1() {
        int[] nums = new int[]{5, 2, 3, 1};
        int[] ints = solution.sortArray(nums);
        Assertions.assertThat(ints).containsExactly(1, 2, 3, 5);
    }

    @Test
    void sortArray2() {
        int[] nums = new int[]{5, 1, 1, 2, 0, 0};
        int[] ints = solution.sortArray(nums);
        Assertions.assertThat(ints).containsExactly(0, 0, 1, 1, 2, 5);
    }

    @Test
    void sortArray3() {
        int[] nums = new int[]{8, 7, 6, 1, 0, 9, 2};
        int[] ints = solution.sortArray(nums);
        Assertions.assertThat(ints).containsExactly(0, 1, 2, 6, 7, 8, 9);
    }
}
package solutions.algorithms._0_999._215_Kth_Largest_Element_in_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;

        int answer = solution.findKthLargest(nums, k);

        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void test2() {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        int answer = solution.findKthLargest(nums, k);

        Assertions.assertThat(answer).isEqualTo(4);
    }
}
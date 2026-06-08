package solutions.algorithms._2000_2999._2161_Partition_Array_According_to_Given_Pivot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pivotArray1() {
        int[] nums = new int[]{9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] answer = solution.pivotArray(nums, pivot);
        Assertions.assertThat(answer).containsExactly(9, 5, 3, 10, 10, 12, 14);
    }

    @Test
    void pivotArray2() {
        int[] nums = new int[]{-3, 4, 3, 2};
        int pivot = 2;
        int[] answer = solution.pivotArray(nums, pivot);
        Assertions.assertThat(answer).containsExactly(-3, 2, 4, 3);
    }
}
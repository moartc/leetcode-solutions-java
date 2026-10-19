package solutions.algorithms._2000_2999._2089_Find_Target_Indices_After_Sorting_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void targetIndices1() {
        int[] nums = new int[]{1, 2, 5, 2, 3};
        int target = 2;
        List<Integer> answer = solution.targetIndices(nums, target);
        Assertions.assertThat(answer).containsExactly(1, 2);
    }

    @Test
    void targetIndices2() {
        int[] nums = new int[]{1, 2, 5, 2, 3};
        int target = 3;
        List<Integer> answer = solution.targetIndices(nums, target);
        Assertions.assertThat(answer).containsExactly(3);
    }

    @Test
    void targetIndices3() {
        int[] nums = new int[]{1, 2, 5, 2, 3};
        int target = 5;
        List<Integer> answer = solution.targetIndices(nums, target);
        Assertions.assertThat(answer).containsExactly(4);
    }
}
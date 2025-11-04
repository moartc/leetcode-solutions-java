package solutions.algorithms._0_999._18_4Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fourSum1() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> answer = solution.fourSum(nums, target);
        Assertions.assertThat(answer).hasSameElementsAs(List.of(
                List.of(-2, -1, 1, 2),
                List.of(-2, 0, 0, 2),
                List.of(-1, 0, 0, 1)
        ));
    }

    @Test
    void fourSum2() {
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> answer = solution.fourSum(nums, target);
        Assertions.assertThat(answer.get(0)).containsExactly(2, 2, 2, 2);
    }

    @Test
    void fourSum3() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int target = -1;
        List<List<Integer>> answer = solution.fourSum(nums, target);
        Assertions.assertThat(answer).hasSameElementsAs(List.of(
                List.of(-4, 0, 1, 2),
                List.of(-1, -1, 0, 1)
        ));
    }

    @Test
    void fourSum4() {
        int[] nums = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
        int target = 0;
        List<List<Integer>> answer = solution.fourSum(nums, target);
        Assertions.assertThat(answer).hasSameElementsAs(List.of(
                List.of(-3, -2, 2, 3),
                List.of(-3, -1, 1, 3),
                List.of(-3, 0, 0, 3),
                List.of(-3, 0, 1, 2),
                List.of(-2, -1, 0, 3),
                List.of(-2, -1, 1, 2),
                List.of(-2, 0, 0, 2),
                List.of(-1, 0, 0, 1)
        ));
    }

    @Test
    void fourSum5() {
        int[] nums = new int[]{2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> answer = solution.fourSum(nums, target);
        Assertions.assertThat(answer).hasSameElementsAs(List.of(
                List.of(2, 2, 2, 2)
        ));
    }


}
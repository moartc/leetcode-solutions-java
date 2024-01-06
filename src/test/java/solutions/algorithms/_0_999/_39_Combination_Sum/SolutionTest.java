package solutions.algorithms._0_999._39_Combination_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._39_Combination_Sum.Solution;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSumTest1() {
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = List.of(List.of(2, 2, 3), List.of(7));
        List<List<Integer>> actual = solution.combinationSum(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void combinationSumTest2() {
        int[] candidates = new int[]{2, 3, 5};
        int target = 8;
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
        List<List<Integer>> actual = solution.combinationSum(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void combinationSumTest3() {
        int[] candidates = new int[]{2};
        int target = 1;
        List<List<Integer>> expected = List.of();
        List<List<Integer>> actual = solution.combinationSum(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void combinationSumTest4() {
        int[] candidates = new int[]{7, 6, 3, 2};
        int target = 7;
        List<List<Integer>> expected = List.of(List.of(2, 2, 3), List.of(7));
        List<List<Integer>> actual = solution.combinationSum(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
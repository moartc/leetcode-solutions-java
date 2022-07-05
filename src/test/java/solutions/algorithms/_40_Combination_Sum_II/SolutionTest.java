package solutions.algorithms._40_Combination_Sum_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combinationSum2Test1() {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> expected = List.of(
                List.of(1, 1, 6),
                List.of(1, 2, 5),
                List.of(1, 7),
                List.of(2, 6)
        );
        List<List<Integer>> actual = solution.combinationSum2(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void combinationSum2Test2() {
        int[] candidates = new int[]{2, 5, 2, 1, 2};
        int target = 5;
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 2),
                List.of(5)
        );
        List<List<Integer>> actual = solution.combinationSum2(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void combinationSum2Test3() {
        int[] candidates = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 27;
        List<List<Integer>> expected = List.of(
        );
        List<List<Integer>> actual = solution.combinationSum2(candidates, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
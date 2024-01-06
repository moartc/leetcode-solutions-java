package solutions.algorithms._0_999._47_Permutations_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void permuteUniqueTest1() {
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> expected = List.of(
                List.of(1, 1, 2),
                List.of(1, 2, 1),
                List.of(2, 1, 1)
        );
        List<List<Integer>> actual = solution.permuteUnique(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void permuteUniqueTest2() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        List<List<Integer>> actual = solution.permuteUnique(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void permuteUniqueTest3() {
        int[] nums = new int[]{2};
        List<List<Integer>> expected = List.of(
                List.of(2)
        );
        List<List<Integer>> actual = solution.permuteUnique(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}
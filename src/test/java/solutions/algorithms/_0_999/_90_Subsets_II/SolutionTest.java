package solutions.algorithms._0_999._90_Subsets_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._90_Subsets_II.Solution;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subsetsWithDupTest1() {
        int[] nums = new int[]{1, 2, 2};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(1, 2),
                List.of(1, 2, 2),
                List.of(2),
                List.of(2, 2)
        );
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void subsetsWithDupTest2() {
        int[] nums = new int[]{0};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(0)
        );
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void subsetsWithDupTest3() {
        int[] nums = new int[]{4, 4, 4, 1, 4};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(1, 4),
                List.of(1, 4, 4),
                List.of(1, 4, 4, 4),
                List.of(1, 4, 4, 4, 4),
                List.of(4),
                List.of(4, 4),
                List.of(4, 4, 4),
                List.of(4, 4, 4, 4)
                );
        List<List<Integer>> actual = solution.subsetsWithDup(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}
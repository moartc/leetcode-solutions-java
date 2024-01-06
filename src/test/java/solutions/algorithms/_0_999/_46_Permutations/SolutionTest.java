package solutions.algorithms._0_999._46_Permutations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void permuteTest1() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );
        assertThat(solution.permute(nums)).hasSameElementsAs(expected);
    }

    @Test
    void permuteTest2() {
        int[] nums = new int[]{0, 1};
        List<List<Integer>> expected = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );
        assertThat(solution.permute(nums)).hasSameElementsAs(expected);
    }

    @Test
    void permuteTest3() {
        int[] nums = new int[]{1};
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        assertThat(solution.permute(nums)).hasSameElementsAs(expected);
    }

    @Test
    void permuteTest4() {
        int[] nums = new int[]{1, 2, 3, 4};
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3, 4),
                List.of(2, 1, 3, 4),
                List.of(3, 1, 2, 4),
                List.of(1, 3, 2, 4),
                List.of(2, 3, 1, 4),
                List.of(3, 2, 1, 4),
                List.of(3, 2, 4, 1),
                List.of(2, 3, 4, 1),
                List.of(4, 3, 2, 1),
                List.of(3, 4, 2, 1),
                List.of(2, 4, 3, 1),
                List.of(4, 2, 3, 1),
                List.of(4, 1, 3, 2),
                List.of(1, 4, 3, 2),
                List.of(3, 4, 1, 2),
                List.of(4, 3, 1, 2),
                List.of(1, 3, 4, 2),
                List.of(3, 1, 4, 2),
                List.of(2, 1, 4, 3),
                List.of(1, 2, 4, 3),
                List.of(4, 2, 1, 3),
                List.of(2, 4, 1, 3),
                List.of(1, 4, 2, 3),
                List.of(4, 1, 2, 3)
        );
        assertThat(solution.permute(nums)).hasSameElementsAs(expected);
    }
}

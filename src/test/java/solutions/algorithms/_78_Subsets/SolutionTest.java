package solutions.algorithms._78_Subsets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subsetsTest1() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(3),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
        List<List<Integer>> actual = solution.subsets(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void subsetsTest2() {
        int[] nums = new int[]{0};
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(0)
        );
        List<List<Integer>> actual = solution.subsets(nums);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}
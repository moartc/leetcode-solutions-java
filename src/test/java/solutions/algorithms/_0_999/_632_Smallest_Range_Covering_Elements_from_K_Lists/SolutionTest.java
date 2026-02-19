package solutions.algorithms._0_999._632_Smallest_Range_Covering_Elements_from_K_Lists;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestRange1() {
        List<List<Integer>> nums = List.of(
                List.of(4, 10, 15, 24, 26),
                List.of(0, 9, 12, 20),
                List.of(5, 18, 22, 30)
        );
        int[] answer = solution.smallestRange(nums);
        Assertions.assertThat(answer).containsExactly(20, 24);
    }

    @Test
    void smallestRange2() {
        List<List<Integer>> nums = List.of(
                List.of(1, 2, 3),
                List.of(1, 2, 3),
                List.of(1, 2, 3)
        );
        int[] answer = solution.smallestRange(nums);
        Assertions.assertThat(answer).containsExactly(1, 1);
    }
}
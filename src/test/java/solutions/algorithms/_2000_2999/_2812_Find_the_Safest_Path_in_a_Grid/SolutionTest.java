package solutions.algorithms._2000_2999._2812_Find_the_Safest_Path_in_a_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumSafenessFactor1() {
        List<List<Integer>> grid = List.of(
                List.of(1, 0, 0),
                List.of(0, 0, 0),
                List.of(0, 0, 1)
        );
        int answer = solution.maximumSafenessFactor(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maximumSafenessFactor2() {
        List<List<Integer>> grid = List.of(
                List.of(0, 0, 1),
                List.of(0, 0, 0),
                List.of(0, 0, 0)
        );
        int answer = solution.maximumSafenessFactor(grid);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maximumSafenessFactor3() {
        List<List<Integer>> grid = List.of(
                List.of(0, 0, 0, 1),
                List.of(0, 0, 0, 0),
                List.of(0, 0, 0, 0),
                List.of(1, 0, 0, 0)
        );
        int answer = solution.maximumSafenessFactor(grid);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maximumSafenessFactor4() {
        List<List<Integer>> grid = List.of(
                List.of(0, 1, 1),
                List.of(0, 1, 1),
                List.of(0, 0, 1)
        );
        int answer = solution.maximumSafenessFactor(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}
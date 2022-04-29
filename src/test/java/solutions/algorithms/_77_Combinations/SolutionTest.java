package solutions.algorithms._77_Combinations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void combineTest1() {
        int n = 4;
        int k = 2;
        List<List<Integer>> expected = List.of(
                List.of(2, 4),
                List.of(3, 4),
                List.of(2, 3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(1, 4)
        );
        List<List<Integer>> actual = solution.combine(n, k);
        assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void combineTest2() {
        int n = 1;
        int k = 1;
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        List<List<Integer>> actual = solution.combine(n, k);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void combineTest3() {
        int n = 4;
        int k = 3;
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 2, 4),
                List.of(1, 3, 4),
                List.of(2, 3, 4)
        );
        List<List<Integer>> actual = solution.combine(n, k);
        assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void combineTest4() {
        int n = 4;
        int k = 4;
        List<List<Integer>> expected = List.of(List.of(1, 2, 3, 4));
        List<List<Integer>> actual = solution.combine(n, k);
        assertThat(actual).hasSameElementsAs(expected);
    }
}
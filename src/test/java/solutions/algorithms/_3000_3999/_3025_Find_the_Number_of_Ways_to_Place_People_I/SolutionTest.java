package solutions.algorithms._3000_3999._3025_Find_the_Number_of_Ways_to_Place_People_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfPairsTest1() {
        int[][] ints = {{1, 1}, {2, 2}, {3, 3}};
        int actual = solution.numberOfPairs(ints);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void numberOfPairsTest2() {
        int[][] ints = {{6, 2}, {4, 4}, {2, 6}};

        int actual = solution.numberOfPairs(ints);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void numberOfPairsTest3() {
        int[][] ints = {{3, 1}, {1, 3}, {1, 1}};
        int actual = solution.numberOfPairs(ints);
        Assertions.assertThat(actual).isEqualTo(2);
    }
}
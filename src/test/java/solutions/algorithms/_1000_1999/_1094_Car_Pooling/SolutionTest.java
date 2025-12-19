package solutions.algorithms._1000_1999._1094_Car_Pooling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void carPooling1() {
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        boolean answer = solution.carPooling(trips, capacity);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void carPooling2() {
        int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        boolean answer = solution.carPooling(trips, capacity);
        Assertions.assertThat(answer).isTrue();
    }
}
package solutions.algorithms._1000_1999._1306_Jump_Game_III;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canReach1() {
        int[] arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        int start = 5;
        boolean answer = solution.canReach(arr, start);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canReach2() {
        int[] arr = new int[]{4, 2, 3, 0, 3, 1, 2};
        int start = 0;
        boolean answer = solution.canReach(arr, start);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canReach3() {
        int[] arr = new int[]{3, 0, 2, 1, 2};
        int start = 2;
        boolean answer = solution.canReach(arr, start);
        Assertions.assertThat(answer).isFalse();
    }
}
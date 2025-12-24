package solutions.algorithms._0_999._473_Matchsticks_to_Square;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void makesquare1() {
        int[] sticks = new int[]{1, 1, 2, 2, 2};
        boolean answer = solution.makesquare(sticks);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void makesquare2() {
        int[] sticks = new int[]{3, 3, 3, 3, 4};
        boolean answer = solution.makesquare(sticks);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void makesquare3() {
        int[] sticks = new int[]{5, 5, 5, 5, 16, 4, 4, 4, 4, 4, 3, 3, 3, 3, 4};
        boolean answer = solution.makesquare(sticks);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void makesquare4() {
        int[] sticks = new int[]{5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3};
        boolean answer = solution.makesquare(sticks);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void makesquare5() {
        int[] sticks = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        boolean answer = solution.makesquare(sticks);
        Assertions.assertThat(answer).isTrue();
    }
}
package solutions.algorithms._0_999._735_Asteroid_Collision;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void asteroidCollision1() {
        int[] asteroids = new int[]{5, 10, -5};
        int[] answer = solution.asteroidCollision(asteroids);
        Assertions.assertThat(answer).containsExactly(5, 10);
    }

    @Test
    void asteroidCollision2() {
        int[] asteroids = new int[]{8, -8};
        int[] answer = solution.asteroidCollision(asteroids);
        Assertions.assertThat(answer).isEmpty();
    }

    @Test
    void asteroidCollision3() {
        int[] asteroids = new int[]{3, 5, -6, 2, -1, 4};
        int[] answer = solution.asteroidCollision(asteroids);
        Assertions.assertThat(answer).containsExactly(-6, 2, 4);
    }
}